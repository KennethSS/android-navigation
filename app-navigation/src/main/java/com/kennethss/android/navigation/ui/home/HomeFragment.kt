package com.kennethss.android.navigation.ui.home

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context.NOTIFICATION_SERVICE
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.app.NotificationCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.NavDeepLinkBuilder
import androidx.navigation.fragment.FragmentNavigatorExtras
import com.kennethss.android.navigation.AppViewModel
import com.kennethss.android.navigation.R
import com.kennethss.android.navigation.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private val appViewModel by activityViewModels<AppViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnSetting.setOnClickListener {
            appViewModel.navigateToSetting(id = 0)
        }

        binding.btnSettingWithTransition.setOnClickListener {
            appViewModel.navigateToSettingWithSharedElementTransition(
                id = 1,
                extras = FragmentNavigatorExtras(binding.btnSettingWithTransition to "setting_transition")
            )
        }

        binding.deepLink.setOnClickListener {
            val args = Bundle().apply {
                putInt("id", 4)
            }

            val pending = NavDeepLinkBuilder(it.context)
                .setGraph(R.navigation.app_navigation)
                .setDestination(R.id.setting_navigation)
                .setArguments(args)
                .createPendingIntent()
            showNotification(pending)
        }
    }

    private fun showNotification(pending: PendingIntent) {
        val nm = requireActivity().getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        val channelId = "channel_id"
        val channelName = "channel_name"
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channel =
                NotificationChannel(channelId, channelName, NotificationManager.IMPORTANCE_DEFAULT)
            nm.createNotificationChannel(channel)
        }
        val notify = NotificationCompat.Builder(requireContext(), channelId)
            .setContentTitle("DeepLink")
            .setContentText("Click!")
            .setSmallIcon(R.mipmap.ic_launcher)
            .setContentIntent(pending)
            .build()

        nm.notify(1, notify)
    }

    companion object {
        fun newInstance(): HomeFragment {
            val args = Bundle()

            val fragment = HomeFragment()
            fragment.arguments = args
            return fragment
        }
    }
}