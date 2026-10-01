package kc;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.d1;
import androidx.fragment.app.q;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.livxow.tv.activities.MainActivity;
import com.livxow.tv.activities.PlayerActivity;
import com.livxow.tv.activities.SupportActivity;
import com.livxow.tv.app.App;
import com.livxow.tv.services.FloatingPlayer;
import java.util.ArrayList;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sb.p;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class k extends q {
    public JSONArray J0;
    public String K0;
    public String L0;
    public boolean M0;
    public boolean N0;
    public p O0;

    public static void S(h.j jVar, JSONArray jSONArray, String str, String str2, boolean z2, boolean z10) {
        if (jSONArray == null || jSONArray.length() < 2) {
            T(jVar, str, str2, 0, z2, z10);
            return;
        }
        k kVar = new k();
        Bundle bundle = new Bundle();
        bundle.putString("linkNames", jSONArray.toString());
        bundle.putString("links", str);
        bundle.putString("title", str2);
        bundle.putBoolean("isEncoded", z2);
        bundle.putBoolean("isTv", z10);
        kVar.L(bundle);
        kVar.R(jVar.o(), "LinksDialog");
    }

    public static void T(h.j jVar, String str, String str2, int i, boolean z2, boolean z10) {
        pc.a aVar;
        Intent intent = new Intent();
        intent.putExtra("title", str2);
        intent.putExtra("links", str);
        intent.putExtra("position", i);
        intent.putExtra("isEncoded", z2);
        if (z10) {
            intent.setClass(jVar, PlayerActivity.class);
            jVar.startActivity(intent);
            return;
        }
        if (vc.a.j(jVar).getInt("floatings", 0) <= 0 || !(jVar instanceof MainActivity)) {
            intent.putExtra("isPlayerActivity", true);
        } else {
            MainActivity mainActivity = (MainActivity) jVar;
            if (Settings.canDrawOverlays(mainActivity)) {
                intent.putExtra("isPlayerActivity", false);
            } else {
                mainActivity.f3636e0 = new androidx.fragment.app.e(17, intent, mainActivity);
                try {
                    mainActivity.f3638g0.a(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + mainActivity.getPackageName())));
                } catch (ActivityNotFoundException | IllegalArgumentException | SecurityException unused) {
                }
            }
        }
        if (jVar.getSharedPreferences("DataPreferences", 0).getBoolean("is_tv", false) ? jVar.getSharedPreferences("DataPreferences", 0).getBoolean("tv_external_ad_enabled", false) : jVar.getSharedPreferences("DataPreferences", 0).getBoolean("external_ad_enabled", false)) {
            int i10 = jVar.getSharedPreferences("DataPreferences", 0).getInt("external_ad_repeat_after", 3);
            int i11 = jVar.getSharedPreferences("DataPreferences", 0).getInt("player_called", 0);
            if ((i11 < i10 ? i11 : 0) == 0 && (aVar = App.P.f3685v) != null && !TextUtils.isEmpty(aVar.f10478m) && aVar.f10478m.startsWith("http")) {
                if (System.currentTimeMillis() - vc.a.j(jVar).getLong("support_time_ms", 0L) > ((long) aVar.f10481p) * 3600000) {
                    intent.setClass(jVar, SupportActivity.class);
                    jVar.startActivity(intent);
                    return;
                }
            }
        }
        if (intent.getBooleanExtra("isPlayerActivity", true)) {
            intent.setClass(jVar, PlayerActivity.class);
            jVar.startActivity(intent);
        } else {
            intent.setClass(jVar, FloatingPlayer.class);
            jVar.startService(intent);
        }
    }

    @Override // androidx.fragment.app.y
    public final void A() {
        this.Z = true;
        Dialog dialog = this.E0;
        if (dialog == null || dialog.getWindow() == null) {
            return;
        }
        DisplayMetrics displayMetrics = m().getDisplayMetrics();
        int i = (int) (((double) displayMetrics.widthPixels) * 0.9d);
        int i10 = (int) (((double) displayMetrics.heightPixels) * 0.75d);
        ((ConstraintLayout) this.O0.f11742w).measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = ((ConstraintLayout) this.O0.f11742w).getMeasuredHeight();
        if (vc.a.s(j()) || measuredHeight <= i10) {
            this.E0.getWindow().setLayout(i, -2);
        } else {
            this.E0.getWindow().setLayout(i, i10);
        }
    }

    @Override // androidx.fragment.app.y
    public final void E() {
        Context contextJ = j();
        JSONArray jSONArray = this.J0;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    pc.g gVar = new pc.g();
                    gVar.f10519a = jSONObject.getString("name");
                    gVar.f10520b = jSONObject.getString("tag");
                    gVar.f10521c = jSONObject.getString("colorCode");
                    arrayList.add(gVar);
                } catch (JSONException unused) {
                }
            } catch (JSONException unused2) {
                pc.g gVar2 = new pc.g();
                gVar2.f10519a = jSONArray.getString(i);
                gVar2.f10520b = "HD";
                gVar2.f10521c = "#08C7D6";
                arrayList.add(gVar2);
            }
        }
        ((RecyclerView) this.O0.f11745z).setAdapter(new hc.q(contextJ, arrayList, new d1(25, this)));
        ((RecyclerView) this.O0.f11745z).setLayoutManager(new LinearLayoutManager(1));
        ((ConstraintLayout) this.O0.f11743x).setOnClickListener(new com.google.android.material.datepicker.n(9, this));
    }

    @Override // androidx.fragment.app.q
    public final Dialog Q(Bundle bundle) {
        Dialog dialogQ = super.Q(bundle);
        Window window = dialogQ.getWindow();
        Objects.requireNonNull(window);
        window.setBackgroundDrawable(new ColorDrawable(0));
        dialogQ.setCancelable(true);
        dialogQ.setCanceledOnTouchOutside(true);
        return dialogQ;
    }

    @Override // androidx.fragment.app.q, androidx.fragment.app.y
    public final void v(Bundle bundle) {
        super.v(bundle);
        Bundle bundle2 = this.B;
        if (bundle2 != null) {
            try {
                this.J0 = new JSONArray(bundle2.getString("linkNames"));
            } catch (JSONException unused) {
            }
            this.L0 = bundle2.getString("links");
            this.K0 = bundle2.getString("title");
            this.M0 = bundle2.getBoolean("isEncoded");
            this.N0 = bundle2.getBoolean("isTv");
        }
    }

    @Override // androidx.fragment.app.y
    public final View w(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewK;
        View viewInflate = layoutInflater.inflate(fc.m.dialog_links, viewGroup, false);
        int i = fc.l.btnCancel;
        ConstraintLayout constraintLayout = (ConstraintLayout) a.a.k(viewInflate, i);
        if (constraintLayout != null) {
            i = fc.l.cancelIcon;
            if (((ImageView) a.a.k(viewInflate, i)) != null) {
                i = fc.l.cancelText;
                if (((TextView) a.a.k(viewInflate, i)) != null) {
                    i = fc.l.contentContainer;
                    if (((ConstraintLayout) a.a.k(viewInflate, i)) != null) {
                        i = fc.l.iconContainer;
                        if (((FrameLayout) a.a.k(viewInflate, i)) != null && (viewK = a.a.k(viewInflate, (i = fc.l.liveStripe))) != null) {
                            i = fc.l.streamsRecycler;
                            RecyclerView recyclerView = (RecyclerView) a.a.k(viewInflate, i);
                            if (recyclerView != null) {
                                i = fc.l.subtitleText;
                                if (((TextView) a.a.k(viewInflate, i)) != null) {
                                    i = fc.l.titleText;
                                    if (((TextView) a.a.k(viewInflate, i)) != null) {
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                        this.O0 = new p(constraintLayout2, constraintLayout, viewK, recyclerView, 17);
                                        return constraintLayout2;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
