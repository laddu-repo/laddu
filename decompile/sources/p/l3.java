package p;

import android.content.Context;
import android.view.View;
import android.view.Window;
import com.google.protobuf.CodedOutputStream;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class l3 implements View.OnClickListener {

    /* renamed from: x, reason: collision with root package name */
    public final o.a f10290x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ m3 f10291y;

    /* JADX WARN: Type inference failed for: r0v0, types: [o.a, java.lang.Object] */
    public l3(m3 m3Var) {
        this.f10291y = m3Var;
        Context context = m3Var.f10301a.getContext();
        CharSequence charSequence = m3Var.f10308h;
        ?? obj = new Object();
        obj.f9745e = CodedOutputStream.DEFAULT_BUFFER_SIZE;
        obj.f9747g = CodedOutputStream.DEFAULT_BUFFER_SIZE;
        obj.f9751l = null;
        obj.f9752m = null;
        obj.f9753n = false;
        obj.f9754o = false;
        obj.f9755p = 16;
        obj.f9749i = context;
        obj.f9741a = charSequence;
        this.f10290x = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        m3 m3Var = this.f10291y;
        Window.Callback callback = m3Var.f10310k;
        if (callback != null && m3Var.f10311l) {
            callback.onMenuItemSelected(0, this.f10290x);
        }
    }
}
