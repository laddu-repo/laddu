package hc;

import android.os.CountDownTimer;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.card.MaterialCardView;
import com.livxow.tv.app.App;
import de.hdodenhof.circleimageview.CircleImageView;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import o4.b0;
import o4.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class h extends b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6223d;
    public final h.j f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6226h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6227j = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f6225g = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final App f6224e = App.P;

    public h(h.j jVar, List list, String str, String str2) {
        this.f = jVar;
        this.f6226h = str;
        this.i = str2;
        this.f6223d = vc.a.j(jVar).getBoolean("is_tv", false);
        i(list);
    }

    public static void j(oc.a aVar, pc.e eVar) {
        String str;
        TextView textView = aVar.A;
        textView.setVisibility(0);
        TextView textView2 = aVar.B;
        textView2.setVisibility(0);
        aVar.F.setVisibility(8);
        String str2 = eVar.f10504j + "|" + eVar.i;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy|HH:mm:ss");
        SimpleDateFormat simpleDateFormatF = vc.a.f("dd/MM/yyyy|HH:mm:ss");
        try {
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
            str = simpleDateFormat.format(simpleDateFormatF.parse(str2));
        } catch (ParseException unused) {
            str = null;
        }
        String[] strArrSplit = str.split("\\|");
        textView.setText(strArrSplit[0]);
        String[] strArrSplit2 = strArrSplit[1].split("\\s+")[0].split(":");
        int i = Integer.parseInt(strArrSplit2[0]);
        int i10 = Integer.parseInt(strArrSplit2[1]);
        String str3 = i < 12 ? " AM" : " PM";
        int i11 = i % 12;
        int i12 = i11 != 0 ? i11 : 12;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i12 < 10 ? d0.d.h(i12, "0") : Integer.valueOf(i12));
        sb2.append(":");
        sb2.append(i10 < 10 ? d0.d.h(i10, "0") : Integer.valueOf(i10));
        sb2.append(str3);
        textView2.setText(sb2.toString());
    }

    @Override // o4.b0
    public final int a() {
        return this.f6225g.size();
    }

    @Override // o4.b0
    public final long b(int i) {
        return i;
    }

    @Override // o4.b0
    public final int c(int i) {
        return ((pc.e) this.f6225g.get(i)).f10497a.equals("adpro*") ? 2 : 1;
    }

    @Override // o4.b0
    public final void d(z0 z0Var, int i) {
        CountDownTimer countDownTimerStart;
        pc.e eVar = (pc.e) this.f6225g.get(i);
        if (z0Var instanceof g) {
            g gVar = (g) z0Var;
            if (!gVar.f6222x.f6226h.contains("*ad") && (gVar.f6222x.f6226h.contains("http://") || gVar.f6222x.f6226h.contains("https://"))) {
                gVar.q();
                return;
            }
            String str = gVar.f6222x.f6226h;
            if (!str.contains("<script") && !str.startsWith("http")) {
                try {
                    if (Base64.decode(gVar.f6222x.f6226h, 0) != null) {
                        str = new String(Base64.decode(gVar.f6222x.f6226h, 0));
                    }
                } catch (IllegalArgumentException unused) {
                }
            }
            if (!str.contains("<script") && !str.contains("*ad")) {
                if (str.contains("http://") || str.contains("https://")) {
                    gVar.q();
                    return;
                } else {
                    gVar.f6219u.setVisibility(8);
                    return;
                }
            }
            try {
                String str2 = "http://localhost:1120";
                if (str.contains("*ad")) {
                    str2 = str.split("\\*")[0];
                } else if (qc.k.f10982g == null) {
                    synchronized (qc.k.class) {
                        try {
                            if (qc.k.f10982g == null) {
                                qc.k.f10982g = new qc.k(str);
                            } else {
                                qc.k.f10982g.f = str;
                                qc.k kVar = qc.k.f10982g;
                                kVar.f10983e = "<!DOCTYPE html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <title>Ad</title>\n    <style>\n        body {\n            display: flex;\n            justify-content: center;\n            align-items: center;\n            height: 100vh;\n            margin: 0;\n            background: transparent;\n        }\n    </style>\n</head>\n<body>\n" + kVar.f + "</body>\n</html>";
                            }
                        } finally {
                        }
                    }
                }
                gVar.f6220v.setVisibility(8);
                gVar.f6221w.setBackgroundColor(0);
                gVar.f6221w.setWebViewClient(new f(gVar, str2));
                gVar.f6221w.setWebChromeClient(new WebChromeClient());
                WebView.setWebContentsDebuggingEnabled(true);
                gVar.f6221w.getSettings().setJavaScriptEnabled(true);
                gVar.f6221w.getSettings().setDomStorageEnabled(true);
                gVar.f6221w.getSettings().setMixedContentMode(0);
                gVar.f6221w.getSettings().setUserAgentString("Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/37.0.2049.0 Safari/537.36");
                gVar.f6221w.loadUrl(str2);
                gVar.f6221w.setVisibility(0);
                gVar.f6219u.setVisibility(0);
                return;
            } catch (IOException e7) {
                Toast.makeText(gVar.f6222x.f, e7.getMessage(), 0).show();
                return;
            }
        }
        if (z0Var instanceof oc.a) {
            oc.a aVar = (oc.a) z0Var;
            aVar.C.setText((eVar.f10497a + " | " + eVar.f10498b).toUpperCase(Locale.ROOT));
            aVar.f10111y.setText(eVar.f10500d);
            aVar.f10112z.setText(eVar.f10501e);
            aVar.C.setSelected(true);
            aVar.f10111y.setSelected(true);
            aVar.f10112z.setSelected(true);
            aVar.E.setVisibility(eVar.f10509o == 1 ? 0 : 8);
            if (vc.a.r(eVar.f10506l, eVar.f10505k)) {
                j(aVar, eVar);
                aVar.D.setText("Event Finished");
            } else if (vc.a.q(eVar.f10504j, eVar.i)) {
                aVar.A.setVisibility(8);
                aVar.B.setVisibility(8);
                LottieAnimationView lottieAnimationView = aVar.F;
                lottieAnimationView.setVisibility(0);
                lottieAnimationView.animate();
                try {
                    long jE = vc.a.e(eVar.f10504j, eVar.i);
                    aVar.A.setVisibility(8);
                    aVar.B.setVisibility(8);
                    LottieAnimationView lottieAnimationView2 = aVar.F;
                    lottieAnimationView2.setVisibility(0);
                    lottieAnimationView2.animate();
                    aVar.G = new vc.b(jE, aVar).start();
                } catch (ParseException unused2) {
                    aVar.D.setText("");
                }
            } else {
                j(aVar, eVar);
                try {
                    long jE2 = vc.a.e(eVar.f10504j, eVar.i);
                    long jCurrentTimeMillis = jE2 - System.currentTimeMillis();
                    if (jCurrentTimeMillis <= 0) {
                        aVar.A.setVisibility(8);
                        aVar.B.setVisibility(8);
                        LottieAnimationView lottieAnimationView3 = aVar.F;
                        lottieAnimationView3.setVisibility(0);
                        lottieAnimationView3.animate();
                        countDownTimerStart = new vc.b(jE2, aVar).start();
                    } else if (jCurrentTimeMillis >= 3600000) {
                        vc.a.E(jCurrentTimeMillis, aVar);
                        countDownTimerStart = new vc.b(jCurrentTimeMillis, aVar, jE2, 0).start();
                    } else {
                        countDownTimerStart = new vc.b(jE2 - System.currentTimeMillis(), aVar, jE2, 1).start();
                    }
                } catch (ParseException e10) {
                    e10.printStackTrace();
                    aVar.D.setText("Date Error");
                    countDownTimerStart = null;
                }
                aVar.H = countDownTimerStart;
            }
            h(eVar.f, aVar.f10109w);
            h(eVar.f10502g, aVar.f10110x);
            h(eVar.f10499c, aVar.f10108v);
            aVar.f10107u.setOnClickListener(new gc.r(2, this, eVar));
        }
    }

    @Override // o4.b0
    public final z0 e(ViewGroup viewGroup, int i) {
        if (i == 2) {
            return new g(this, LayoutInflater.from(viewGroup.getContext()).inflate(fc.m.item_banner, viewGroup, false));
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(fc.m.item_event, viewGroup, false);
        oc.a aVar = new oc.a(viewInflate);
        aVar.f10107u = (MaterialCardView) viewInflate.findViewById(fc.l.event_card);
        aVar.f10109w = (CircleImageView) viewInflate.findViewById(fc.l.teamAFlag);
        aVar.f10110x = (CircleImageView) viewInflate.findViewById(fc.l.teamBFlag);
        aVar.f10111y = (TextView) viewInflate.findViewById(fc.l.teamAName);
        aVar.f10112z = (TextView) viewInflate.findViewById(fc.l.teamBName);
        aVar.A = (TextView) viewInflate.findViewById(fc.l.date_text);
        aVar.B = (TextView) viewInflate.findViewById(fc.l.time_text);
        aVar.C = (TextView) viewInflate.findViewById(fc.l.event_text);
        aVar.f10108v = (ImageView) viewInflate.findViewById(fc.l.event_logo);
        aVar.D = (TextView) viewInflate.findViewById(fc.l.status_text);
        aVar.E = (TextView) viewInflate.findViewById(fc.l.hotLabel);
        aVar.F = (LottieAnimationView) viewInflate.findViewById(fc.l.live_anim_view);
        return aVar;
    }

    @Override // o4.b0
    public final void f(z0 z0Var) {
        if (z0Var instanceof oc.a) {
            oc.a aVar = (oc.a) z0Var;
            CountDownTimer countDownTimer = aVar.G;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                aVar.G = null;
            }
            CountDownTimer countDownTimer2 = aVar.H;
            if (countDownTimer2 != null) {
                countDownTimer2.cancel();
                aVar.H = null;
            }
        }
    }

    public final boolean g() {
        String str;
        String str2 = this.f6226h;
        if (str2 == null) {
            return false;
        }
        if (str2.contains("http://") || str2.contains("https://")) {
            return true;
        }
        try {
            str = new String(Base64.decode(str2, 0));
        } catch (IllegalArgumentException unused) {
        }
        if (!str.contains("<script") && !str.contains("*ad") && !str.contains("http://")) {
            if (!str.contains("https://")) {
                return false;
            }
        }
        return true;
    }

    public final void h(String str, ImageView imageView) {
        ((com.bumptech.glide.m) com.bumptech.glide.b.e(this.f).n(str).i(fc.k.icon)).v(imageView);
    }

    public final void i(List list) {
        this.f6225g.clear();
        if (list.isEmpty()) {
            return;
        }
        if (!g()) {
            this.f6225g = new ArrayList(list);
            return;
        }
        pc.e eVar = new pc.e();
        eVar.f10497a = "adpro*";
        boolean z2 = false;
        for (int i = 0; i < list.size(); i++) {
            this.f6225g.add((pc.e) list.get(i));
            if (i == 2) {
                this.f6227j = 3;
                this.f6225g.add(eVar);
                z2 = true;
            }
        }
        if (z2) {
            return;
        }
        this.f6227j = this.f6225g.size();
        this.f6225g.add(eVar);
    }
}
