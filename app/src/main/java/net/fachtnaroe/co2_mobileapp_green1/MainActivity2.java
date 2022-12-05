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

class MainActivity extends Form implements HandlesEventDispatching{
    private
    VerticalArrangement Main;
    Label Label2;
    Button PreviousCO2Readings;

    protected void $define() {
        /* this next allows the app to use the full screen.
        In fact, seemingly anything makes this work at 100%
        except "Fixed" and the this.Sizing instruction
        being absent in the first place. */
        /* Cur seo isteach. Is cuma cén focal atá ann, níl gá leis */
        this.Sizing("Responsive");

        Main = new VerticalArrangement(this);
        Main.HeightPercent(100);
        Label2 = new Label(Main);
        Label2.Text("CO2 MONITOR");
        Label2.TextColor(COLOR_BLACK);
        Label2.BackgroundColor(COLOR_CYAN);
        Label2.TextAlignment(ALIGNMENT_CENTER);
        Label2.HeightPercent(8);
        Label2.WidthPercent(100);
        Label2.FontSize(72);
        Label2.FontTypeface(TYPEFACE_SERIF);
        Label2.FontBold(true);

        Label2.Text("CO2 (parts per million-ppm):");
        Label2.TextColor(COLOR_BLACK);
        Label2.BackgroundColor(COLOR_CYAN);
        Label2.TextAlignment(ALIGNMENT_CENTER);
        Label2.HeightPercent(10);
        Label2.WidthPercent(100);
        Label2.FontSize(30);
        Label2.FontTypeface(TYPEFACE_SERIF);

        Label2.Text("565");
        Label2.TextColor(COLOR_BLACK);
        Label2.TextAlignment(ALIGNMENT_CENTER);
        Label2.HeightPercent(10);
        Label2.WidthPercent(100);
        Label2.FontSize(30);
        Label2.BackgroundColor(COLOR_CYAN);
        Label2.FontTypeface(TYPEFACE_SERIF);

        Label2.Text("Temperature (degrees celsius):");
        Label2.TextColor(COLOR_BLACK);
        Label2.TextAlignment(ALIGNMENT_CENTER);
        Label2.HeightPercent(10);
        Label2.WidthPercent(100);
        Label2.FontSize(30);
        Label2.BackgroundColor(COLOR_CYAN);
        Label2.FontTypeface(TYPEFACE_SERIF);
        Label2 = new Label(Main);

        Label2.HeightPercent(10);
        Label2.WidthPercent(100);
        Label2.Text("26");
        Label2.TextAlignment(ALIGNMENT_CENTER);
        Label2.TextColor(COLOR_BLACK);
        Label2.FontSize(30);
        Label2.BackgroundColor(COLOR_CYAN);
        Label2.FontTypeface(TYPEFACE_SERIF);

        PreviousCO2Readings = new Button(Main);
        PreviousCO2Readings.Text("Previous CO2 Readings");
        PreviousCO2Readings.TextColor(COLOR_BLACK);
        PreviousCO2Readings.TextAlignment(ALIGNMENT_CENTER);
        PreviousCO2Readings.HeightPercent(10);
        PreviousCO2Readings.WidthPercent(100);
        PreviousCO2Readings.FontSize(25);
        PreviousCO2Readings.BackgroundColor(COLOR_CYAN);
        PreviousCO2Readings.FontTypeface(TYPEFACE_SERIF);
    }
}
// Here be monsters: