package j4;

import android.content.Context;
import android.media.session.MediaController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final MediaController f7186a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7187b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7188c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f7189d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final a0 f7190e;

    public l(Context context, a0 a0Var) {
        this.f7190e = a0Var;
        MediaController mediaController = new MediaController(context, a0Var.f7156y);
        this.f7186a = mediaController;
        if (a0Var.a() == null) {
            mediaController.sendCommand("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new j(this));
        }
    }

    public final void a() {
        if (this.f7190e.a() == null) {
            return;
        }
        ArrayList arrayList = this.f7188c;
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            arrayList.clear();
        } else {
            if (it.next() == null) {
                this.f7189d.put(null, new k());
                throw null;
            }
            throw new ClassCastException();
        }
    }
}
