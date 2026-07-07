package com.playfy.tv.ui.fragments;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.util.Base64;
import android.view.View;
import androidx.lifecycle.d1;
import androidx.lifecycle.i;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bf.o;
import cf.n;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.p4;
import com.playfy.tv.R;
import com.playfy.tv.databinding.FragmentSettingsBinding;
import com.playfy.tv.databinding.InputLyBinding;
import gd.c;
import gf.f0;
import he.a;
import he.g;
import he.m;
import ie.k;
import j1.y;
import java.util.List;
import k6.e;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.x;
import nd.d0;
import nd.g0;
import wf.h1;
import yf.t;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class SettingsFragment extends y {
    public static final /* synthetic */ o[] E0;
    public c A0;
    public final Object B0;
    public final Object C0;
    public final m D0;

    /* renamed from: z0, reason: collision with root package name */
    public final j6.c f3381z0;

    static {
        q qVar = new q(SettingsFragment.class, "binding", "getBinding()Lcom/playfy/tv/databinding/FragmentSettingsBinding;");
        x.f8056a.getClass();
        E0 = new o[]{qVar};
    }

    public SettingsFragment() {
        super(R.layout.fragment_settings);
        this.f3381z0 = e.o(this, FragmentSettingsBinding.class);
        g0 g0Var = new g0(this, 0);
        g gVar = g.f6073x;
        this.B0 = a.c(gVar, g0Var);
        this.C0 = a.c(gVar, new g0(this, 1));
        this.D0 = a.d(new i(this, 18));
    }

    public static List O(InputLyBinding inputLyBinding) {
        String str;
        String str2;
        String str3;
        String valueOf = String.valueOf(inputLyBinding.f3323q.getText());
        Editable text = inputLyBinding.f3321o.getText();
        String str4 = null;
        if (text == null || (str = text.toString()) == null || str.length() == 0) {
            str = null;
        }
        Editable text2 = inputLyBinding.f3318l.getText();
        if (text2 == null || (str2 = text2.toString()) == null || str2.length() == 0) {
            str2 = null;
        }
        Editable text3 = inputLyBinding.f3316i.getText();
        if (text3 == null || (str3 = text3.toString()) == null || str3.length() == 0) {
            str3 = null;
        }
        Editable text4 = inputLyBinding.f3314g.getText();
        if (text4 != null) {
            str4 = text4.toString();
        }
        return k.t(valueOf, str, str2, str3, str4, String.valueOf(inputLyBinding.f3309b.isChecked()));
    }

    @Override // j1.y
    public final void B(View view, Bundle bundle) {
        kotlin.jvm.internal.k.e(view, "view");
        this.A0 = new c(new n(this, 15), (byte) 0);
        RecyclerView recyclerView = ((FragmentSettingsBinding) this.f3381z0.a(this, E0[0])).f3306a;
        F();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        c cVar = this.A0;
        le.c cVar2 = null;
        if (cVar != null) {
            recyclerView.setAdapter(cVar);
            f0.w(d1.e(this), null, new d0(this, cVar2, 0), 3);
        } else {
            kotlin.jvm.internal.k.k("adapter");
            throw null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [he.f, java.lang.Object] */
    public final SharedPreferences N() {
        return (SharedPreferences) this.B0.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [he.f, java.lang.Object] */
    public final void P(List list) {
        SharedPreferences.Editor edit = N().edit();
        xf.c cVar = (xf.c) this.C0.getValue();
        cVar.getClass();
        wf.c cVar2 = new wf.c(a4.i(h1.f14332a), 0);
        j2.y yVar = new j2.y((byte) 0, 8);
        yf.e eVar = yf.e.f15064c;
        yVar.f7145z = eVar.b(128);
        try {
            new t(new p4(yVar), cVar, yf.x.f15107z, new t[yf.x.E.a()]).q(cVar2, list);
            String yVar2 = yVar.toString();
            char[] array = (char[]) yVar.f7145z;
            eVar.getClass();
            kotlin.jvm.internal.k.e(array, "array");
            eVar.a(array);
            try {
                byte[] bytes = yVar2.getBytes(df.a.f4115a);
                kotlin.jvm.internal.k.d(bytes, "getBytes(...)");
                String encodeToString = Base64.encodeToString(bytes, 0);
                kotlin.jvm.internal.k.b(encodeToString);
                yVar2 = encodeToString;
            } catch (Exception unused) {
            }
            edit.putString("nsv", yVar2);
            edit.apply();
        } catch (Throwable th) {
            yf.e eVar2 = yf.e.f15064c;
            char[] array2 = (char[]) yVar.f7145z;
            eVar2.getClass();
            kotlin.jvm.internal.k.e(array2, "array");
            eVar2.a(array2);
            throw th;
        }
    }
}
