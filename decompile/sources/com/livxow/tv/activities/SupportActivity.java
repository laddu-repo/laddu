package com.livxow.tv.activities;

import ab.f;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.emoji2.text.v;
import androidx.fragment.app.d1;
import androidx.media3.decoder.DecoderInputBuffer;
import c2.b;
import com.livxow.tv.activities.SupportActivity;
import com.livxow.tv.app.App;
import com.livxow.tv.services.FloatingPlayer;
import fc.i;
import fc.l;
import fc.m;
import fc.q;
import h.j;
import java.util.concurrent.TimeUnit;
import k8.g2;
import ob.d;
import pc.a;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class SupportActivity extends j {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ int f3674d0 = 0;
    public f W;
    public Intent X;
    public a Y;
    public boolean Z = false;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Handler f3675a0 = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public v f3676b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public g2 f3677c0;

    @Override // h.j, c.j, h0.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final int i = 0;
        View viewInflate = getLayoutInflater().inflate(m.activity_support, (ViewGroup) null, false);
        int i10 = l.btnClickHere;
        LinearLayout linearLayout = (LinearLayout) a.a.k(viewInflate, i10);
        if (linearLayout != null) {
            i10 = l.btnClose;
            TextView textView = (TextView) a.a.k(viewInflate, i10);
            if (textView != null) {
                i10 = l.btnHowToOpenAds;
                LinearLayout linearLayout2 = (LinearLayout) a.a.k(viewInflate, i10);
                if (linearLayout2 != null) {
                    i10 = l.btnJoinTelegram;
                    LinearLayout linearLayout3 = (LinearLayout) a.a.k(viewInflate, i10);
                    if (linearLayout3 != null) {
                        i10 = l.choice_txt;
                        TextView textView2 = (TextView) a.a.k(viewInflate, i10);
                        if (textView2 != null) {
                            i10 = l.inst_time_txt;
                            TextView textView3 = (TextView) a.a.k(viewInflate, i10);
                            if (textView3 != null) {
                                i10 = l.inst_wait_seconds_txt;
                                TextView textView4 = (TextView) a.a.k(viewInflate, i10);
                                if (textView4 != null) {
                                    i10 = l.tvAdFrequency;
                                    TextView textView5 = (TextView) a.a.k(viewInflate, i10);
                                    if (textView5 != null) {
                                        i10 = l.tvSupportMeta;
                                        TextView textView6 = (TextView) a.a.k(viewInflate, i10);
                                        if (textView6 != null) {
                                            f fVar = new f();
                                            fVar.f298a = linearLayout;
                                            fVar.f299b = textView;
                                            fVar.f300c = linearLayout2;
                                            fVar.f301d = linearLayout3;
                                            fVar.f302e = textView2;
                                            fVar.f = textView3;
                                            fVar.f303g = textView4;
                                            fVar.f304h = textView5;
                                            fVar.i = textView6;
                                            this.W = fVar;
                                            setContentView((ScrollView) viewInflate);
                                            this.X = getIntent();
                                            a aVar = App.P.f3685v;
                                            this.Y = aVar;
                                            if (aVar == null) {
                                                Toast.makeText(this, "App details not found", 0).show();
                                                finish();
                                                return;
                                            }
                                            vc.a.j(this).edit().putBoolean("support_ad_clicked", false).apply();
                                            ((TextView) this.W.f304h).setText("Open 1 AD per " + this.Y.f10481p + "h");
                                            ((TextView) this.W.i).setText("Wait time: " + this.Y.f10480o + "s • Trigger: every " + this.Y.f10481p + "h • Auto close: ON");
                                            TextView textView7 = (TextView) this.W.f303g;
                                            StringBuilder sb2 = new StringBuilder("Stay on the page for ");
                                            sb2.append(this.Y.f10480o);
                                            sb2.append(" seconds ♥️");
                                            textView7.setText(sb2.toString());
                                            ((TextView) this.W.f).setText("Enjoy ad-free streaming for next " + this.Y.f10481p + " " + getString(q.hours));
                                            TextView textView8 = (TextView) this.W.f302e;
                                            int i11 = q.ad_choice;
                                            String strL = j4.a.l(this.Y.f10481p, "", new StringBuilder());
                                            StringBuilder sb3 = new StringBuilder();
                                            final int i12 = 3;
                                            sb3.append(getSharedPreferences("DataPreferences", 0).getInt("external_ad_repeat_after", 3));
                                            sb3.append("");
                                            final int i13 = 2;
                                            final int i14 = 1;
                                            textView8.setText(getString(i11, strL, sb3.toString()));
                                            ((LinearLayout) this.W.f298a).startAnimation(AnimationUtils.loadAnimation(this, i.zoom_anim_loop));
                                            ((TextView) this.W.f299b).setOnClickListener(new View.OnClickListener(this) { // from class: gc.o

                                                /* JADX INFO: renamed from: w, reason: collision with root package name */
                                                public final /* synthetic */ SupportActivity f5821w;

                                                {
                                                    this.f5821w = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    int i15 = i;
                                                    SupportActivity supportActivity = this.f5821w;
                                                    switch (i15) {
                                                        case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                                            int i16 = SupportActivity.f3674d0;
                                                            supportActivity.x();
                                                            break;
                                                        case 1:
                                                            supportActivity.w(supportActivity.Y.f10469b);
                                                            break;
                                                        case 2:
                                                            supportActivity.w(supportActivity.Y.f10479n);
                                                            break;
                                                        default:
                                                            int i17 = SupportActivity.f3674d0;
                                                            supportActivity.y();
                                                            break;
                                                    }
                                                }
                                            });
                                            ((LinearLayout) this.W.f301d).setOnClickListener(new View.OnClickListener(this) { // from class: gc.o

                                                /* JADX INFO: renamed from: w, reason: collision with root package name */
                                                public final /* synthetic */ SupportActivity f5821w;

                                                {
                                                    this.f5821w = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    int i15 = i14;
                                                    SupportActivity supportActivity = this.f5821w;
                                                    switch (i15) {
                                                        case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                                            int i16 = SupportActivity.f3674d0;
                                                            supportActivity.x();
                                                            break;
                                                        case 1:
                                                            supportActivity.w(supportActivity.Y.f10469b);
                                                            break;
                                                        case 2:
                                                            supportActivity.w(supportActivity.Y.f10479n);
                                                            break;
                                                        default:
                                                            int i17 = SupportActivity.f3674d0;
                                                            supportActivity.y();
                                                            break;
                                                    }
                                                }
                                            });
                                            ((LinearLayout) this.W.f300c).setOnClickListener(new View.OnClickListener(this) { // from class: gc.o

                                                /* JADX INFO: renamed from: w, reason: collision with root package name */
                                                public final /* synthetic */ SupportActivity f5821w;

                                                {
                                                    this.f5821w = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    int i15 = i13;
                                                    SupportActivity supportActivity = this.f5821w;
                                                    switch (i15) {
                                                        case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                                            int i16 = SupportActivity.f3674d0;
                                                            supportActivity.x();
                                                            break;
                                                        case 1:
                                                            supportActivity.w(supportActivity.Y.f10469b);
                                                            break;
                                                        case 2:
                                                            supportActivity.w(supportActivity.Y.f10479n);
                                                            break;
                                                        default:
                                                            int i17 = SupportActivity.f3674d0;
                                                            supportActivity.y();
                                                            break;
                                                    }
                                                }
                                            });
                                            ((LinearLayout) this.W.f298a).setOnClickListener(new View.OnClickListener(this) { // from class: gc.o

                                                /* JADX INFO: renamed from: w, reason: collision with root package name */
                                                public final /* synthetic */ SupportActivity f5821w;

                                                {
                                                    this.f5821w = this;
                                                }

                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    int i15 = i12;
                                                    SupportActivity supportActivity = this.f5821w;
                                                    switch (i15) {
                                                        case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                                                            int i16 = SupportActivity.f3674d0;
                                                            supportActivity.x();
                                                            break;
                                                        case 1:
                                                            supportActivity.w(supportActivity.Y.f10469b);
                                                            break;
                                                        case 2:
                                                            supportActivity.w(supportActivity.Y.f10479n);
                                                            break;
                                                        default:
                                                            int i17 = SupportActivity.f3674d0;
                                                            supportActivity.y();
                                                            break;
                                                    }
                                                }
                                            });
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
    }

    @Override // h.j, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        v vVar = this.f3676b0;
        if (vVar != null) {
            this.f3675a0.removeCallbacks(vVar);
        }
    }

    @Override // h.j, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.Z) {
            this.Z = false;
            v vVar = this.f3676b0;
            if (vVar != null) {
                this.f3675a0.removeCallbacks(vVar);
                if (this.f3677c0 == null) {
                    this.f3677c0 = new g2(this, new d1(22, this));
                }
                Dialog dialog = (Dialog) this.f3677c0.f7546w;
                if (dialog != null && !dialog.isShowing()) {
                    dialog.show();
                }
            }
            ((LinearLayout) this.W.f298a).setEnabled(true);
        }
    }

    public final boolean v() {
        return getPackageManager().resolveService(new Intent("android.support.customtabs.action.CustomTabsService"), 0) != null;
    }

    public final void w(String str) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException | IllegalArgumentException | SecurityException unused) {
        }
    }

    public final void x() {
        if (this.X.getBooleanExtra("isPlayerActivity", true)) {
            this.X.setClass(this, PlayerActivity.class);
            startActivity(this.X);
        } else {
            this.X.setClass(this, FloatingPlayer.class);
            startService(this.X);
        }
        finish();
    }

    public final void y() {
        String str = this.Y.f10478m;
        if (TextUtils.isEmpty(str) || !str.startsWith("http")) {
            Toast.makeText(this, "Ad URL not available", 0).show();
            return;
        }
        ((LinearLayout) this.W.f298a).setEnabled(false);
        this.Z = true;
        b bVar = new b(5);
        ((Intent) bVar.f1686w).putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
        d dVarF = bVar.f();
        try {
            if (!v()) {
                x();
                return;
            }
            Uri uri = Uri.parse(str);
            Intent intent = (Intent) dVarF.f10105w;
            intent.setData(uri);
            startActivity(intent, (Bundle) dVarF.f10106x);
            v vVar = new v(20, this);
            this.f3676b0 = vVar;
            this.f3675a0.postDelayed(vVar, TimeUnit.SECONDS.toMillis(this.Y.f10480o));
            Toast.makeText(this, "Stay on page for " + this.Y.f10480o + " seconds...", 0).show();
        } catch (ActivityNotFoundException | IllegalArgumentException | SecurityException unused) {
            x();
        }
    }
}
