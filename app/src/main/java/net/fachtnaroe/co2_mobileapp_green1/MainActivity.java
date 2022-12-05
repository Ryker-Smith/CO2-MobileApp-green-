package net.fachtnaroe.co2_mobileapp_green1;

import android.graphics.fonts.FontFamily;

import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Clock;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Notifier;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.VerticalScrollArrangement;

import java.util.Random;

class MyApplication extends Form implements HandlesEventDispatching {
    private
    VerticalArrangement Main;
    Label Label1, Label3;

    protected void $define() {
        /* this next allows the app to use the full screen.
        In fact, seemingly anything makes this work at 100%
        except "Fixed" and the this.Sizing instruction
        being absent in the first place. */
        /* Cur seo isteach. Is cuma cén focal atá ann, níl gá leis */
        this.Sizing("Responsive");

        Main = new VerticalArrangement(this);
        Main.HeightPercent(100);
        Main.Image("CO2_Sensor.jpg");
        Label1 = new Label (Main);
        Label1.Text("CO2 Sensor");
        Label1.TextColor(COLOR_BLACK);
        Label1.BackgroundColor(COLOR_CYAN);
        Label1.TextAlignment(ALIGNMENT_CENTER);
        Label1.HeightPercent(8);
        Label1.WidthPercent(100);
        Label1.FontSize(72);
        Label1.FontTypeface(TYPEFACE_SERIF);
        Label1.FontBold(true);
    }
}
// Here be monsters: