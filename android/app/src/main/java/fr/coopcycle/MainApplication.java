package fr.coopcycle;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.gettipsi.stripe.StripeReactPackage;
import com.airbnb.android.react.maps.MapsPackage;
import com.i18n.reactnativei18n.ReactNativeI18n;
import com.corbt.keepawake.KCKeepAwakePackage;
import com.gettipsi.stripe.StripeReactPackage;
import com.airbnb.android.react.maps.MapsPackage;
import com.corbt.keepawake.KCKeepAwakePackage;
import com.corbt.keepawake.KCKeepAwakePackage;
import com.gettipsi.stripe.StripeReactPackage;
import com.airbnb.android.react.maps.MapsPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      return Arrays.<ReactPackage>asList(
          new MainReactPackage(),
            new StripeReactPackage(),
            new MapsPackage(),
            new ReactNativeI18n(),
            new KCKeepAwakePackage(),
            new StripeReactPackage(),
            new MapsPackage(),
            new KCKeepAwakePackage(),
            new KCKeepAwakePackage(),
            new StripeReactPackage(),
            new MapsPackage()
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
