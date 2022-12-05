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

public class MainActivity3 extends Form implements HandlesEventDispatching{
    private
    VerticalArrangement Main;
    Label Label3;

    protected void $define() {
        /* this next allows the app to use the full screen.
        In fact, seemingly anything makes this work at 100%
        except "Fixed" and the this.Sizing instruction
        being absent in the first place. */
        /* Cur seo isteach. Is cuma cén focal atá ann, níl gá leis */
        this.Sizing("Responsive");

        Main = new VerticalArrangement(this);
        Main.HeightPercent(100);
        Label3 = new Label(Main);
        Label3.HeightPercent(10);
        Label3.WidthPercent(100);
        Label3.Text("Previous CO2 Readings");
        Label3.TextAlignment(ALIGNMENT_CENTER);
        Label3.TextColor(COLOR_BLACK);
        Label3.FontSize(72);
        Label3.BackgroundColor(COLOR_CYAN);
        Label3.FontTypeface(TYPEFACE_SERIF);

        Label3.HeightPercent(10);
        Label3.WidthPercent(100);
        Label3.Text("565");
        Label3.TextAlignment(ALIGNMENT_CENTER);
        Label3.TextColor(COLOR_BLACK);
        Label3.FontSize(30);
        Label3.BackgroundColor(COLOR_CYAN);
        Label3.FontTypeface(TYPEFACE_SERIF);

        Label3.HeightPercent(10);
        Label3.WidthPercent(100);
        Label3.Text("618");
        Label3.TextAlignment(ALIGNMENT_CENTER);
        Label3.TextColor(COLOR_BLACK);
        Label3.FontSize(30);
        Label3.BackgroundColor(COLOR_CYAN);
        Label3.FontTypeface(TYPEFACE_SERIF);

        Label3.HeightPercent(10);
        Label3.WidthPercent(100);
        Label3.Text("594");
        Label3.TextAlignment(ALIGNMENT_CENTER);
        Label3.TextColor(COLOR_BLACK);
        Label3.FontSize(30);
        Label3.BackgroundColor(COLOR_CYAN);
        Label3.FontTypeface(TYPEFACE_SERIF);

        Label3 = new Label(Main);
        Label3.HeightPercent(10);
        Label3.WidthPercent(100);
        Label3.Text("649");
        Label3.TextAlignment(ALIGNMENT_CENTER);
        Label3.TextColor(COLOR_BLACK);
        Label3.FontSize(30);
        Label3.BackgroundColor(COLOR_CYAN);
        Label3.FontTypeface(TYPEFACE_SERIF);

        Label3.HeightPercent(10);
        Label3.WidthPercent(100);
        Label3.Text("523");
        Label3.TextAlignment(ALIGNMENT_CENTER);
        Label3.TextColor(COLOR_BLACK);
        Label3.FontSize(30);
        Label3.BackgroundColor(COLOR_CYAN);
        Label3.FontTypeface(TYPEFACE_SERIF);

        Label3.HeightPercent(10);
        Label3.WidthPercent(100);
        Label3.Text("606");
        Label3.TextAlignment(ALIGNMENT_CENTER);
        Label3.TextColor(COLOR_BLACK);
        Label3.FontSize(30);
        Label3.BackgroundColor(COLOR_CYAN);
        Label3.FontTypeface(TYPEFACE_SERIF);

        Label3.HeightPercent(10);
        Label3.WidthPercent(100);
        Label3.Text("482");
        Label3.TextAlignment(ALIGNMENT_CENTER);
        Label3.TextColor(COLOR_BLACK);
        Label3.FontSize(30);
        Label3.BackgroundColor(COLOR_CYAN);
        Label3.FontTypeface(TYPEFACE_SERIF);
    }
}
// Here be monsters: