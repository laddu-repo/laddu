package nd;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.drake.net.exception.NetConnectException;
import com.drake.net.exception.NetUnknownHostException;
import com.drake.net.exception.NetworkingException;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.playfy.tv.R;
import com.playfy.tv.databinding.ErrorLyBinding;
import java.util.List;
import kd.m0;
import kf.f1;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements ve.l {

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f9676x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ d f9677y;

    public /* synthetic */ b(d dVar, int i6) {
        this.f9676x = i6;
        this.f9677y = dVar;
    }

    @Override // ve.l
    public final Object invoke(Object obj) {
        boolean z10;
        m0 m0Var;
        int i6 = this.f9676x;
        List list = null;
        he.y yVar = he.y.f6101a;
        d dVar = this.f9677y;
        switch (i6) {
            case 0:
                jd.y yVar2 = (jd.y) obj;
                bf.o[] oVarArr = d.D0;
                if (dVar.N().f3290a.f1176z) {
                    dVar.N().f3290a.setRefreshing(yVar2 instanceof jd.w);
                }
                kotlin.jvm.internal.k.b(yVar2);
                ErrorLyBinding errorLyBinding = dVar.N().f3292c;
                TextView textView = errorLyBinding.f3260f;
                TextView textView2 = errorLyBinding.f3259e;
                ImageView imageView = errorLyBinding.f3257c;
                LinearLayout linearLayout = errorLyBinding.f3258d;
                CircularProgressIndicator circularProgressIndicator = errorLyBinding.f3261g;
                boolean z11 = dVar.N().f3290a.f1176z;
                int i10 = 0;
                int i11 = 8;
                if (yVar2 instanceof jd.w) {
                    if (z11) {
                        i10 = 8;
                    }
                    circularProgressIndicator.setVisibility(i10);
                    linearLayout.setVisibility(8);
                } else if (yVar2 instanceof jd.v) {
                    circularProgressIndicator.setVisibility(8);
                    linearLayout.setVisibility(0);
                    Throwable th = ((jd.v) yVar2).f7410a;
                    if (!(th instanceof NetConnectException) && !(th instanceof NetworkingException) && !(th instanceof NetUnknownHostException)) {
                        imageView.setImageResource(R.drawable.ic_warning);
                        textView2.setText(R.string.connection_error_title);
                        textView.setText(R.string.connection_error_text);
                    } else {
                        imageView.setImageResource(R.drawable.ic_wifi_error);
                        textView2.setText(R.string.no_internet_title);
                        textView.setText(R.string.no_internet_text);
                    }
                } else if (yVar2 instanceof jd.x) {
                    circularProgressIndicator.setVisibility(8);
                    linearLayout.setVisibility(8);
                    TextView textView3 = errorLyBinding.f3256b;
                    Object obj2 = ((jd.x) yVar2).f7412a;
                    if (obj2 instanceof List) {
                        z10 = ((List) obj2).isEmpty();
                    } else {
                        if (obj2 instanceof he.i) {
                            Object obj3 = ((he.i) obj2).f6077y;
                            if (obj3 instanceof List) {
                                list = (List) obj3;
                            }
                            if (list != null && list.isEmpty()) {
                                z10 = true;
                            }
                        }
                        z10 = false;
                    }
                    if (z10) {
                        i11 = 0;
                    }
                    textView3.setVisibility(i11);
                    List items = (List) obj2;
                    gd.p pVar = (gd.p) dVar.B0.getValue();
                    k4.z zVar = new k4.z(0);
                    pVar.getClass();
                    kotlin.jvm.internal.k.e(items, "items");
                    if (!((Boolean) pVar.H.getValue()).booleanValue()) {
                        List list2 = ((id.h) pVar.G.getValue()).f6831c.f7843d;
                        m0 m0Var2 = (m0) ie.j.I(1, list2);
                        if (((m0Var2 != null && m0Var2.f7880a > 0) || ((m0Var = (m0) ie.j.I(4, list2)) != null && m0Var.f7880a > 0)) && !items.isEmpty()) {
                            je.c h4 = a8.g.h();
                            h4.addAll(items);
                            int size = items.size();
                            if (size > 3) {
                                size = 3;
                            }
                            h4.add(size, gd.l.f5627a);
                            items = a8.g.c(h4);
                        }
                    }
                    pVar.A.b(items, zVar);
                } else {
                    throw new RuntimeException();
                }
                return yVar;
            case 1:
                bf.o[] oVarArr2 = d.D0;
                ((gd.f) dVar.C0.getValue()).i((List) obj);
                return yVar;
            default:
                String it = (String) obj;
                bf.o[] oVarArr3 = d.D0;
                kotlin.jvm.internal.k.e(it, "it");
                f1 f1Var = dVar.P().f10106c;
                f1Var.getClass();
                f1Var.h(null, it);
                return yVar;
        }
    }
}
