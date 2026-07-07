package hc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.livxow.tv.app.App;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.TimeZone;
import o4.b0;
import o4.z0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k extends b0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f6239e;
    public final App f = App.P;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f6240g;

    public k(Context context, ArrayList arrayList) {
        this.f6239e = context;
        this.f6240g = new ArrayList(arrayList);
        this.f6238d = vc.a.s(context);
    }

    public static void g(k kVar, String str, ImageView imageView) {
        ((com.bumptech.glide.m) com.bumptech.glide.b.e(kVar.f6239e).n(str).i(fc.k.icon)).v(imageView);
    }

    @Override // o4.b0
    public final int a() {
        return this.f6240g.size();
    }

    @Override // o4.b0
    public final long b(int i) {
        return i;
    }

    @Override // o4.b0
    public final void d(z0 z0Var, int i) {
        String str;
        j jVar = (j) z0Var;
        pc.f fVar = (pc.f) this.f6240g.get(i);
        TextView textView = jVar.f6237z;
        TextView textView2 = jVar.f6236y;
        TextView textView3 = jVar.A;
        k kVar = jVar.D;
        jVar.C.setVisibility(fVar.f10518k ? 0 : 8);
        textView3.setText(fVar.f10510a + " | " + fVar.f10511b);
        textView3.setSelected(true);
        textView2.setText(fVar.f10513d);
        textView.setText(fVar.f10514e);
        textView2.setSelected(true);
        textView.setSelected(true);
        String strN = j4.a.n(new StringBuilder(), fVar.i, "|12:00:00");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy|HH:mm:ss");
        SimpleDateFormat simpleDateFormatF = vc.a.f("dd/MM/yyyy|HH:mm:ss");
        try {
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
            str = simpleDateFormat.format(simpleDateFormatF.parse(strN));
        } catch (ParseException unused) {
            str = null;
        }
        jVar.B.setText(str.split("\\|")[0]);
        g(kVar, fVar.f10512c, jVar.f6233v);
        g(kVar, fVar.f, jVar.f6234w);
        g(kVar, fVar.f10515g, jVar.f6235x);
        jVar.f6232u.setOnClickListener(new gc.r(3, jVar, fVar));
    }

    @Override // o4.b0
    public final z0 e(ViewGroup viewGroup, int i) {
        return new j(this, LayoutInflater.from(viewGroup.getContext()).inflate(fc.m.item_highlight, viewGroup, false));
    }

    @Override // o4.b0
    public final int c(int i) {
        return i;
    }
}
