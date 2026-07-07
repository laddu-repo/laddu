package p;

import android.content.Context;
import android.os.CountDownTimer;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.playfy.tv.R;
import com.unity3d.services.UnityAdsConstants;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class q3 implements i8.b {
    public Object A;
    public Object B;
    public Object C;
    public Object D;

    /* renamed from: x, reason: collision with root package name */
    public Object f10362x;

    /* renamed from: y, reason: collision with root package name */
    public Object f10363y;

    /* renamed from: z, reason: collision with root package name */
    public Object f10364z;

    public q3() {
        this.f10362x = new AtomicBoolean();
        this.f10363y = null;
        this.f10364z = new HashMap(16, 1.0f);
        this.A = new HashMap(16, 1.0f);
        this.B = new HashMap(16, 1.0f);
        this.C = new HashMap(16, 1.0f);
        this.D = null;
    }

    public static String b(long j) {
        long j10 = j / UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT;
        long j11 = 3600;
        long j12 = j10 / j11;
        long j13 = 60;
        long j14 = (j10 % j11) / j13;
        long j15 = j10 % j13;
        if (j12 > 0) {
            return String.format(Locale.getDefault(), "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j12), Long.valueOf(j14), Long.valueOf(j15)}, 3));
        }
        return String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j14), Long.valueOf(j15)}, 2));
    }

    public void a() {
        TextView textView = (TextView) this.f10363y;
        textView.setVisibility(0);
        TextView textView2 = (TextView) this.f10364z;
        textView2.setText(R.string.match_ended);
        textView2.setTextColor(-1);
        textView.setTextColor(i0.f.c(textView.getContext(), R.color.primary_color));
        TextView textView3 = (TextView) this.A;
        if (textView3 != null) {
            textView3.setVisibility(0);
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.B;
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        }
    }

    public void c() {
        Calendar calendar;
        he.m mVar = (he.m) this.C;
        kd.a0 a0Var = (kd.a0) this.f10362x;
        TextView textView = (TextView) this.A;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) this.B;
        CountDownTimer countDownTimer = (CountDownTimer) this.D;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (lottieAnimationView != null) {
            lottieAnimationView.setVisibility(8);
        }
        if (textView != null) {
            textView.setVisibility(0);
        }
        Calendar calendar2 = null;
        try {
            Date parse = ((SimpleDateFormat) mVar.getValue()).parse(a0Var.C);
            calendar = Calendar.getInstance();
            kotlin.jvm.internal.k.b(parse);
            calendar.setTime(parse);
        } catch (ParseException unused) {
            calendar = null;
        }
        try {
            Date parse2 = ((SimpleDateFormat) mVar.getValue()).parse(a0Var.D);
            Calendar calendar3 = Calendar.getInstance();
            kotlin.jvm.internal.k.b(parse2);
            calendar3.setTime(parse2);
            calendar2 = calendar3;
        } catch (ParseException unused2) {
        }
        Calendar calendar4 = Calendar.getInstance();
        if (calendar != null && calendar2 != null) {
            if (TimeUnit.HOURS.toMillis(2L) >= calendar.getTimeInMillis() - calendar4.getTimeInMillis()) {
                long timeInMillis = calendar.getTimeInMillis();
                long timeInMillis2 = calendar2.getTimeInMillis();
                TextView textView2 = (TextView) this.f10363y;
                long currentTimeMillis = timeInMillis - System.currentTimeMillis();
                if (currentTimeMillis > 0) {
                    TextView textView3 = (TextView) this.f10364z;
                    textView3.setText(R.string.match_starting_in);
                    textView3.setTextColor(-1);
                    textView2.setTextColor(i0.f.c(textView2.getContext(), R.color.primary_color));
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                    if (lottieAnimationView != null) {
                        lottieAnimationView.setVisibility(8);
                    }
                    CountDownTimer countDownTimer2 = (CountDownTimer) this.D;
                    if (countDownTimer2 != null) {
                        countDownTimer2.cancel();
                    }
                    textView2.setText(b(currentTimeMillis));
                    this.D = new gd.d(currentTimeMillis, this, timeInMillis2, timeInMillis).start();
                    return;
                }
                d(timeInMillis2, timeInMillis);
                return;
            }
            if (calendar4.after(calendar) && calendar4.before(calendar2)) {
                d(calendar2.getTimeInMillis(), calendar.getTimeInMillis());
            } else if (calendar4.after(calendar2)) {
                a();
            }
        }
    }

    public void d(long j, long j10) {
        TextView textView = (TextView) this.f10363y;
        long currentTimeMillis = j - System.currentTimeMillis();
        if (currentTimeMillis > 0) {
            textView.setVisibility(0);
            TextView textView2 = (TextView) this.f10364z;
            textView2.setTextColor(-1);
            textView.setTextColor(i0.f.c(textView.getContext(), R.color.primary_color));
            textView2.setText(R.string.match_started);
            TextView textView3 = (TextView) this.A;
            if (textView3 != null) {
                textView3.setVisibility(8);
            }
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.B;
            if (lottieAnimationView != null) {
                lottieAnimationView.setVisibility(0);
            }
            CountDownTimer countDownTimer = (CountDownTimer) this.D;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            textView.setText(b(System.currentTimeMillis() - j10));
            this.D = new gd.d(currentTimeMillis, j, j10, this).start();
            return;
        }
        a();
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [p8.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [p8.a, java.lang.Object] */
    @Override // ge.a
    public Object get() {
        return new e6.j((Context) ((ge.a) this.f10362x).get(), (h8.e) ((ge.a) this.f10363y).get(), (n8.d) ((ge.a) this.f10364z).get(), (androidx.lifecycle.j1) ((androidx.lifecycle.j1) this.A).get(), (Executor) ((ge.a) this.B).get(), (o8.c) ((ge.a) this.C).get(), new Object(), new Object(), (n8.c) ((ge.a) this.D).get());
    }

    public q3(kd.a0 eventInfo, TextView textView, TextView textView2, boolean z10, TextView textView3, LottieAnimationView lottieAnimationView) {
        he.i iVar;
        kotlin.jvm.internal.k.e(eventInfo, "eventInfo");
        this.f10362x = eventInfo;
        this.f10364z = textView;
        this.f10363y = textView2;
        this.A = textView3;
        this.B = lottieAnimationView;
        he.m d10 = he.a.d(new d.a0(2));
        this.C = d10;
        try {
            Date parse = ((SimpleDateFormat) d10.getValue()).parse(eventInfo.C);
            kotlin.jvm.internal.k.b(parse);
            TimeZone timeZone = TimeZone.getDefault();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm a", Locale.getDefault());
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(timeZone.getID()));
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
            simpleDateFormat2.setTimeZone(TimeZone.getTimeZone(timeZone.getID()));
            iVar = new he.i(simpleDateFormat.format(Long.valueOf(parse.getTime())), simpleDateFormat2.format(Long.valueOf(parse.getTime())));
        } catch (Exception e10) {
            e10.printStackTrace();
            iVar = new he.i(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
        }
        ((TextView) this.f10364z).setText((CharSequence) iVar.f6076x);
        ((TextView) this.f10363y).setText((CharSequence) iVar.f6077y);
        if (z10) {
            c();
        }
    }
}
