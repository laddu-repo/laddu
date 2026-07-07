package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h implements x, AdapterView.OnItemClickListener {
    public ExpandedMenuView A;
    public w B;
    public g C;

    /* renamed from: x, reason: collision with root package name */
    public Context f9769x;

    /* renamed from: y, reason: collision with root package name */
    public LayoutInflater f9770y;

    /* renamed from: z, reason: collision with root package name */
    public l f9771z;

    public h(Context context) {
        this.f9769x = context;
        this.f9770y = LayoutInflater.from(context);
    }

    @Override // o.x
    public final void c(Context context, l lVar) {
        if (this.f9769x != null) {
            this.f9769x = context;
            if (this.f9770y == null) {
                this.f9770y = LayoutInflater.from(context);
            }
        }
        this.f9771z = lVar;
        g gVar = this.C;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // o.x
    public final boolean d() {
        return false;
    }

    @Override // o.x
    public final void e(l lVar, boolean z10) {
        w wVar = this.B;
        if (wVar != null) {
            wVar.e(lVar, z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.DialogInterface$OnClickListener, android.content.DialogInterface$OnKeyListener, o.w, java.lang.Object, android.content.DialogInterface$OnDismissListener, o.m] */
    @Override // o.x
    public final boolean f(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f9776a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.f9798x = d0Var;
        i.g gVar = new i.g(context);
        h hVar = new h(gVar.getContext());
        obj.f9800z = hVar;
        hVar.B = obj;
        d0Var.b(hVar, context);
        h hVar2 = obj.f9800z;
        if (hVar2.C == null) {
            hVar2.C = new g(hVar2);
        }
        g gVar2 = hVar2.C;
        i.d dVar = gVar.f6209a;
        dVar.f6169m = gVar2;
        dVar.f6170n = obj;
        View view = d0Var.f9789o;
        if (view != null) {
            dVar.f6162e = view;
        } else {
            dVar.f6160c = d0Var.f9788n;
            gVar.setTitle(d0Var.f9787m);
        }
        dVar.f6168l = obj;
        i.h create = gVar.create();
        obj.f9799y = create;
        create.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.f9799y.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.f9799y.show();
        w wVar = this.B;
        if (wVar != null) {
            wVar.v(d0Var);
            return true;
        }
        return true;
    }

    @Override // o.x
    public final void g() {
        g gVar = this.C;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // o.x
    public final boolean i(n nVar) {
        return false;
    }

    @Override // o.x
    public final void j(w wVar) {
        throw null;
    }

    @Override // o.x
    public final boolean k(n nVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i6, long j) {
        this.f9771z.q(this.C.getItem(i6), this, 0);
    }
}
