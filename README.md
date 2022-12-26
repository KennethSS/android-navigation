

## Deeplink

### Android

``` shell
adb shell am start -a android.intent.action.VIEW -d "https://navigation/setting/4"
```



### Compose

``` shell
adb shell am start -d "navigation_compose://setting/3" -a android.intent.action.VIEW
adb shell am start -d "navigation_compose://username/kenneth" -a android.intent.action.VIEW
```