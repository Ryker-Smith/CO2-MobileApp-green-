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

public class MainActivity extends Form implements HandlesEventDispatching {
    private
    VerticalArrangement Main;
    Label Label1, Label2, Label3, TextBox1, Label4, TextBox2, Label5, TextBox3, TextBox4, TextBox5, TextBox6, TextBox7, TextBox8, TextBox9;
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
        Main.Image("CO2Sensor.jpg");
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

        Label3 = new Label(Main);
        Label3.Text("CO2 (parts per million-ppm):");
        Label3.TextColor(COLOR_BLACK);
        Label3.BackgroundColor(COLOR_CYAN);
        Label3.TextAlignment(ALIGNMENT_CENTER);
        Label3.HeightPercent(10);
        Label3.WidthPercent(100);
        Label3.FontSize(30);
        Label3.FontTypeface(TYPEFACE_SERIF);

        TextBox1 = new Label(Main);
        TextBox1.Text("565");
        TextBox1.TextColor(COLOR_BLACK);
        TextBox1.TextAlignment(ALIGNMENT_CENTER);
        TextBox1.HeightPercent(10);
        TextBox1.WidthPercent(100);
        TextBox1.FontSize(30);
        TextBox1.BackgroundColor(COLOR_CYAN);
        TextBox1.FontTypeface(TYPEFACE_SERIF);

        Label4 = new Label(Main);
        Label4.Text("Temperature (degrees celcius):");
        Label4.TextColor(COLOR_BLACK);
        Label4.TextAlignment(ALIGNMENT_CENTER);
        Label4.HeightPercent(10);
        Label4.WidthPercent(100);
        Label4.FontSize(30);
        Label4.BackgroundColor(COLOR_CYAN);
        Label4.FontTypeface(TYPEFACE_SERIF);

        TextBox2 = new Label(Main);
        TextBox2.HeightPercent(10);
        TextBox2.WidthPercent(100);
        TextBox2.Text("26");
        TextBox2.TextAlignment(ALIGNMENT_CENTER);
        TextBox2.TextColor(COLOR_BLACK);
        TextBox2.FontSize(30);
        TextBox2.BackgroundColor(COLOR_CYAN);
        TextBox2.FontTypeface(TYPEFACE_SERIF);

        PreviousCO2Readings = new Button(Main);
        PreviousCO2Readings.Text("Previous CO2 Readings");
        PreviousCO2Readings.TextColor(COLOR_BLACK);
        PreviousCO2Readings.TextAlignment(ALIGNMENT_CENTER);
        PreviousCO2Readings.HeightPercent(10);
        PreviousCO2Readings.WidthPercent(100);
        PreviousCO2Readings.FontSize(25);
        PreviousCO2Readings.BackgroundColor(COLOR_CYAN);
        PreviousCO2Readings.FontTypeface(TYPEFACE_SERIF);

        Label5 = new Label(Main);
        Label5.HeightPercent(10);
        Label5.WidthPercent(100);
        Label5.Text("Previous CO2 Readings");
        Label5.TextAlignment(ALIGNMENT_CENTER);
        Label5.TextColor(COLOR_BLACK);
        Label5.FontSize(72);
        Label5.BackgroundColor(COLOR_CYAN);
        Label5.FontTypeface(TYPEFACE_SERIF);

        TextBox3 = new Label(Main);
        TextBox3.HeightPercent(10);
        TextBox3.WidthPercent(100);
        TextBox3.Text("565");
        TextBox3.TextAlignment(ALIGNMENT_CENTER);
        TextBox3.TextColor(COLOR_BLACK);
        TextBox3.FontSize(30);
        TextBox3.BackgroundColor(COLOR_CYAN);
        TextBox3.FontTypeface(TYPEFACE_SERIF);

        TextBox4 = new Label(Main);
        TextBox4.HeightPercent(10);
        TextBox4.WidthPercent(100);
        TextBox4.Text("618");
        TextBox4.TextAlignment(ALIGNMENT_CENTER);
        TextBox4.TextColor(COLOR_BLACK);
        TextBox4.FontSize(30);
        TextBox4.BackgroundColor(COLOR_CYAN);
        TextBox4.FontTypeface(TYPEFACE_SERIF);

        TextBox5 = new Label(Main);
        TextBox5.HeightPercent(10);
        TextBox5.WidthPercent(100);
        TextBox5.Text("594");
        TextBox5.TextAlignment(ALIGNMENT_CENTER);
        TextBox5.TextColor(COLOR_BLACK);
        TextBox5.FontSize(30);
        TextBox5.BackgroundColor(COLOR_CYAN);
        TextBox5.FontTypeface(TYPEFACE_SERIF);

        TextBox6 = new Label(Main);
        TextBox6.HeightPercent(10);
        TextBox6.WidthPercent(100);
        TextBox6.Text("649");
        TextBox6.TextAlignment(ALIGNMENT_CENTER);
        TextBox6.TextColor(COLOR_BLACK);
        TextBox6.FontSize(30);
        TextBox6.BackgroundColor(COLOR_CYAN);
        TextBox6.FontTypeface(TYPEFACE_SERIF);

        TextBox7 = new Label(Main);
        TextBox7.HeightPercent(10);
        TextBox7.WidthPercent(100);
        TextBox7.Text("523");
        TextBox7.TextAlignment(ALIGNMENT_CENTER);
        TextBox7.TextColor(COLOR_BLACK);
        TextBox7.FontSize(30);
        TextBox7.BackgroundColor(COLOR_CYAN);
        TextBox7.FontTypeface(TYPEFACE_SERIF);

        TextBox8 = new Label(Main);
        TextBox8.HeightPercent(10);
        TextBox8.WidthPercent(100);
        TextBox8.Text("606");
        TextBox8.TextAlignment(ALIGNMENT_CENTER);
        TextBox8.TextColor(COLOR_BLACK);
        TextBox8.FontSize(30);
        TextBox8.BackgroundColor(COLOR_CYAN);
        TextBox8.FontTypeface(TYPEFACE_SERIF);

        TextBox9 = new Label(Main);
        TextBox9.HeightPercent(10);
        TextBox9.WidthPercent(100);
        TextBox9.Text("482");
        TextBox9.TextAlignment(ALIGNMENT_CENTER);
        TextBox9.TextColor(COLOR_BLACK);
        TextBox9.FontSize(30);
        TextBox9.BackgroundColor(COLOR_CYAN);
        TextBox9.FontTypeface(TYPEFACE_SERIF);
    }
}
// Here be monsters: