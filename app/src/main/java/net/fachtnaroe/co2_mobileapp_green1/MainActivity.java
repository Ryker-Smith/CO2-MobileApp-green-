package net.fachtnaroe.co2_mobileapp_green1;

import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.VerticalArrangement;

class MainActivity extends Form implements HandlesEventDispatching {
    Label Label1;
    Button PreviousCO2Readings;

    protected void $define() {
        /* this next allows the app to use the full screen.
        In fact, seemingly anything makes this work at 100%
        except "Fixed" and the this.Sizing instruction
        being absent in the first place. */
        /* Cur seo isteach. Is cuma cén focal atá ann, níl gá leis */
        this.Sizing("Responsive");

        VerticalArrangement main = new VerticalArrangement(this);
        main.HeightPercent(100);
        main.Image("co2_sensor.jpg");
        Label1 = new Label (main);
        Label1.Text("CO2 Sensor");
        Label1.TextColor(COLOR_BLACK);
        Label1.BackgroundColor(COLOR_CYAN);
        Label1.TextAlignment(ALIGNMENT_CENTER);
        Label1.HeightPercent(8);
        Label1.WidthPercent(100);
        Label1.FontSize(250);
        Label1.FontTypeface(TYPEFACE_SERIF);
        Label1.FontBold(true);

        Label1 = new Label(main);
        Label1.Text("CO2 MONITOR");
        Label1.TextColor(COLOR_BLACK);
        Label1.BackgroundColor(COLOR_CYAN);
        Label1.TextAlignment(ALIGNMENT_CENTER);
        Label1.HeightPercent(8);
        Label1.WidthPercent(100);
        Label1.FontSize(72);
        Label1.FontTypeface(TYPEFACE_SERIF);
        Label1.FontBold(true);

        Label1.Text("CO2 (parts per million-ppm):");
        Label1.TextColor(COLOR_BLACK);
        Label1.BackgroundColor(COLOR_CYAN);
        Label1.TextAlignment(ALIGNMENT_CENTER);
        Label1.HeightPercent(10);
        Label1.WidthPercent(100);
        Label1.FontSize(30);
        Label1.FontTypeface(TYPEFACE_SERIF);

        Label1.Text("565");
        Label1.TextColor(COLOR_BLACK);
        Label1.TextAlignment(ALIGNMENT_CENTER);
        Label1.HeightPercent(10);
        Label1.WidthPercent(100);
        Label1.FontSize(30);
        Label1.BackgroundColor(COLOR_CYAN);
        Label1.FontTypeface(TYPEFACE_SERIF);

        Label1.Text("Temperature (degrees celsius):");
        Label1.TextColor(COLOR_BLACK);
        Label1.TextAlignment(ALIGNMENT_CENTER);
        Label1.HeightPercent(10);
        Label1.WidthPercent(100);
        Label1.FontSize(30);
        Label1.BackgroundColor(COLOR_CYAN);
        Label1.FontTypeface(TYPEFACE_SERIF);
        Label1 = new Label(main);

        Label1.HeightPercent(10);
        Label1.WidthPercent(100);
        Label1.Text("26");
        Label1.TextAlignment(ALIGNMENT_CENTER);
        Label1.TextColor(COLOR_BLACK);
        Label1.FontSize(30);
        Label1.BackgroundColor(COLOR_CYAN);
        Label1.FontTypeface(TYPEFACE_SERIF);

        PreviousCO2Readings = new Button(main);
        PreviousCO2Readings.Text("Previous CO2 Readings");
        PreviousCO2Readings.TextColor(COLOR_BLACK);
        PreviousCO2Readings.TextAlignment(ALIGNMENT_CENTER);
        PreviousCO2Readings.HeightPercent(10);
        PreviousCO2Readings.WidthPercent(100);
        PreviousCO2Readings.FontSize(25);
        PreviousCO2Readings.BackgroundColor(COLOR_CYAN);
        PreviousCO2Readings.FontTypeface(TYPEFACE_SERIF);

        Label1 = new Label(main);
        Label1.HeightPercent(10);
        Label1.WidthPercent(100);
        Label1.Text("Previous CO2 Readings");
        Label1.TextAlignment(ALIGNMENT_CENTER);
        Label1.TextColor(COLOR_BLACK);
        Label1.FontSize(72);
        Label1.BackgroundColor(COLOR_CYAN);
        Label1.FontTypeface(TYPEFACE_SERIF);

        Label1.HeightPercent(10);
        Label1.WidthPercent(100);
        Label1.Text("565");
        Label1.TextAlignment(ALIGNMENT_CENTER);
        Label1.TextColor(COLOR_BLACK);
        Label1.FontSize(30);
        Label1.BackgroundColor(COLOR_CYAN);
        Label1.FontTypeface(TYPEFACE_SERIF);

        Label1.HeightPercent(10);
        Label1.WidthPercent(100);
        Label1.Text("618");
        Label1.TextAlignment(ALIGNMENT_CENTER);
        Label1.TextColor(COLOR_BLACK);
        Label1.FontSize(30);
        Label1.BackgroundColor(COLOR_CYAN);
        Label1.FontTypeface(TYPEFACE_SERIF);

        Label1.HeightPercent(10);
        Label1.WidthPercent(100);
        Label1.Text("594");
        Label1.TextAlignment(ALIGNMENT_CENTER);
        Label1.TextColor(COLOR_BLACK);
        Label1.FontSize(30);
        Label1.BackgroundColor(COLOR_CYAN);
        Label1.FontTypeface(TYPEFACE_SERIF);

        Label1 = new Label(main);
        Label1.HeightPercent(10);
        Label1.WidthPercent(100);
        Label1.Text("649");
        Label1.TextAlignment(ALIGNMENT_CENTER);
        Label1.TextColor(COLOR_BLACK);
        Label1.FontSize(30);
        Label1.BackgroundColor(COLOR_CYAN);
        Label1.FontTypeface(TYPEFACE_SERIF);

        Label1.HeightPercent(10);
        Label1.WidthPercent(100);
        Label1.Text("523");
        Label1.TextAlignment(ALIGNMENT_CENTER);
        Label1.TextColor(COLOR_BLACK);
        Label1.FontSize(30);
        Label1.BackgroundColor(COLOR_CYAN);
        Label1.FontTypeface(TYPEFACE_SERIF);

        Label1.HeightPercent(10);
        Label1.WidthPercent(100);
        Label1.Text("606");
        Label1.TextAlignment(ALIGNMENT_CENTER);
        Label1.TextColor(COLOR_BLACK);
        Label1.FontSize(30);
        Label1.BackgroundColor(COLOR_CYAN);
        Label1.FontTypeface(TYPEFACE_SERIF);

        Label1.HeightPercent(10);
        Label1.WidthPercent(100);
        Label1.Text("482");
        Label1.TextAlignment(ALIGNMENT_CENTER);
        Label1.TextColor(COLOR_BLACK);
        Label1.FontSize(30);
        Label1.BackgroundColor(COLOR_CYAN);
        Label1.FontTypeface(TYPEFACE_SERIF);
    }
}
// Here be monsters: