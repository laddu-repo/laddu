package hc;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.d1;
import androidx.fragment.app.q0;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import k8.k4;
import o4.b0;
import o4.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class q extends b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6251d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f6252e;
    public ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f6253g;

    public q(Context context, ArrayList arrayList, d1 d1Var) {
        this.f6252e = context;
        this.f = arrayList;
        this.f6253g = d1Var;
    }

    @Override // o4.b0
    public final int a() {
        switch (this.f6251d) {
        }
        return this.f.size();
    }

    @Override // o4.b0
    public final long b(int i) {
        switch (this.f6251d) {
        }
        return i;
    }

    @Override // o4.b0
    public final int c(int i) {
        int i10 = this.f6251d;
        return i;
    }

    @Override // o4.b0
    public final void d(z0 z0Var, final int i) {
        switch (this.f6251d) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                pc.g gVar = (pc.g) this.f.get(i);
                sb.p pVar = ((p) z0Var).f6250u;
                ((TextView) pVar.f11745z).setText(gVar.f10519a);
                TextView textView = (TextView) pVar.f11742w;
                textView.setText(gVar.f10520b);
                int color = Color.parseColor(gVar.f10521c);
                ImageView imageView = (ImageView) pVar.f11743x;
                Drawable drawable = imageView.getDrawable();
                if (drawable != null) {
                    drawable.mutate().setTint(color);
                    imageView.setImageDrawable(drawable);
                }
                textView.setTextColor(color);
                ((LinearLayout) pVar.f11744y).setOnClickListener(new g4.i(this, i, 1));
                break;
            default:
                v vVar = (v) z0Var;
                final pc.j jVar = (pc.j) this.f.get(i);
                final String str = jVar.f10535a;
                final String str2 = jVar.f10536b;
                final String str3 = jVar.f10537c;
                final String str4 = jVar.f10538d;
                vVar.f6273v.setText(str);
                vVar.f6274w.setText(str2);
                vVar.f6272u.setOnClickListener(new View.OnClickListener() { // from class: hc.r
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        mc.r rVar = (mc.r) ((k4) this.f6254v.f6253g).f7607v;
                        String str5 = str;
                        rVar.B0 = str5;
                        rVar.A0.f3689z.c(str5);
                        String str6 = str3;
                        boolean zIsEmpty = TextUtils.isEmpty(str6);
                        String strConcat = str2;
                        if (!zIsEmpty) {
                            if (!strConcat.contains("/get.php")) {
                                strConcat = strConcat.concat("/get.php");
                            }
                            strConcat = strConcat + "?username=" + str6 + "&password=" + str4 + "&type=m3u";
                        }
                        rVar.f8616z0 = mc.g.X(strConcat, "m3u");
                        q0 q0VarI = rVar.i();
                        q0VarI.getClass();
                        androidx.fragment.app.a aVar = new androidx.fragment.app.a(q0VarI);
                        aVar.e(fc.l.fragment_container, rVar.f8616z0, null, 1);
                        aVar.d(false);
                        ((FloatingActionButton) rVar.f8613w0.f480x).setVisibility(8);
                        ((SwipeRefreshLayout) rVar.f8613w0.f482z).setVisibility(8);
                        ((FragmentContainerView) rVar.f8613w0.f481y).setVisibility(0);
                    }
                });
                vVar.f6275x.setOnClickListener(new View.OnClickListener() { // from class: hc.s
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        final q qVar = this;
                        Context context = qVar.f6252e;
                        final pc.j jVar2 = jVar;
                        boolean z2 = jVar2.f10539e;
                        final int i10 = i;
                        final String str5 = str;
                        final String str6 = str2;
                        final String str7 = str3;
                        final String str8 = str4;
                        com.bumptech.glide.c.K(context, "Edit Playlist Details", "Update", str5, str6, str7, str8, z2, new kc.e() { // from class: hc.u
                            @Override // kc.e
                            public final void b(String str9, String str10, String str11, String str12) {
                                q qVar2 = qVar;
                                Context context2 = qVar2.f6252e;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(str5);
                                sb2.append("*");
                                sb2.append(str6);
                                sb2.append("*");
                                sb2.append(str7);
                                String strN = j4.a.n(sb2, "*", str8);
                                Set<String> stringSet = vc.a.j(context2).getStringSet("play_list", new HashSet());
                                HashSet hashSet = new HashSet();
                                for (String str13 : stringSet) {
                                    if (str13.equals(strN)) {
                                        hashSet.add(str9 + "*" + str10 + "*" + str11 + "*" + str12);
                                    } else {
                                        hashSet.add(str13);
                                    }
                                }
                                context2.getSharedPreferences("DataPreferences", 0).edit().putStringSet("play_list", hashSet).apply();
                                ArrayList arrayList = qVar2.f;
                                pc.j jVar3 = new pc.j(str9, str10, str11, str12, jVar2.f10539e);
                                int i11 = i10;
                                arrayList.set(i11, jVar3);
                                ((mc.r) ((k4) qVar2.f6253g).f7607v).f8615y0 = new ArrayList(qVar2.f);
                                qVar2.f9680a.c(i11);
                            }
                        });
                    }
                });
                vVar.f6276y.setOnClickListener(new View.OnClickListener() { // from class: hc.t
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        q qVar = this.f6264v;
                        Context context = qVar.f6252e;
                        pc.j jVar2 = jVar;
                        String str5 = jVar2.f10535a;
                        String str6 = jVar2.f10536b;
                        String str7 = jVar2.f10537c;
                        String str8 = jVar2.f10538d;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str5);
                        sb2.append("*");
                        sb2.append(str6);
                        sb2.append("*");
                        sb2.append(str7);
                        String strN = j4.a.n(sb2, "*", str8);
                        Set<String> stringSet = vc.a.j(context).getStringSet("play_list", new HashSet());
                        HashSet hashSet = new HashSet();
                        for (String str9 : stringSet) {
                            if (!str9.equals(strN)) {
                                hashSet.add(str9);
                            }
                        }
                        context.getSharedPreferences("DataPreferences", 0).edit().putStringSet("play_list", hashSet).apply();
                        ArrayList arrayList = qVar.f;
                        int i10 = i;
                        arrayList.remove(i10);
                        ((mc.r) ((k4) qVar.f6253g).f7607v).f8615y0 = new ArrayList(qVar.f);
                        qVar.f9680a.e(i10);
                    }
                });
                break;
        }
    }

    @Override // o4.b0
    public final z0 e(ViewGroup viewGroup, int i) {
        switch (this.f6251d) {
            case DecoderInputBuffer.BUFFER_REPLACEMENT_MODE_DISABLED /* 0 */:
                View viewInflate = LayoutInflater.from(this.f6252e).inflate(fc.m.item_link_option, viewGroup, false);
                int i10 = fc.l.badgeText;
                TextView textView = (TextView) a.a.k(viewInflate, i10);
                if (textView != null) {
                    i10 = fc.l.iconTv;
                    ImageView imageView = (ImageView) a.a.k(viewInflate, i10);
                    if (imageView != null) {
                        LinearLayout linearLayout = (LinearLayout) viewInflate;
                        i10 = fc.l.streamTitle;
                        TextView textView2 = (TextView) a.a.k(viewInflate, i10);
                        if (textView2 != null) {
                            sb.p pVar = new sb.p(linearLayout, textView, imageView, linearLayout, textView2, 20);
                            p pVar2 = new p(linearLayout);
                            pVar2.f6250u = pVar;
                            return pVar2;
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i10)));
            default:
                View viewInflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(fc.m.item_playlist, viewGroup, false);
                v vVar = new v(viewInflate2);
                vVar.f6272u = (CardView) viewInflate2.findViewById(fc.l.playlist_card);
                vVar.f6273v = (TextView) viewInflate2.findViewById(fc.l.playlist_name);
                vVar.f6274w = (TextView) viewInflate2.findViewById(fc.l.playlist_url);
                vVar.f6275x = (ImageButton) viewInflate2.findViewById(fc.l.edit_playlist);
                vVar.f6276y = (ImageButton) viewInflate2.findViewById(fc.l.delete_playlist);
                return vVar;
        }
    }

    public q(Context context, ArrayList arrayList, k4 k4Var) {
        this.f6252e = context;
        this.f = new ArrayList(arrayList);
        this.f6253g = k4Var;
    }
}
