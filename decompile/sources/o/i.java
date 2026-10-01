package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class i extends BaseAdapter {
    public final boolean A;
    public final LayoutInflater B;
    public final int C;

    /* renamed from: x, reason: collision with root package name */
    public final l f9772x;

    /* renamed from: y, reason: collision with root package name */
    public int f9773y = -1;

    /* renamed from: z, reason: collision with root package name */
    public boolean f9774z;

    public i(l lVar, LayoutInflater layoutInflater, boolean z10, int i6) {
        this.A = z10;
        this.B = layoutInflater;
        this.f9772x = lVar;
        this.C = i6;
        a();
    }

    public final void a() {
        l lVar = this.f9772x;
        n nVar = lVar.f9795v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.j;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (((n) arrayList.get(i6)) == nVar) {
                    this.f9773y = i6;
                    return;
                }
            }
        }
        this.f9773y = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final n getItem(int i6) {
        ArrayList l10;
        boolean z10 = this.A;
        l lVar = this.f9772x;
        if (z10) {
            lVar.i();
            l10 = lVar.j;
        } else {
            l10 = lVar.l();
        }
        int i10 = this.f9773y;
        if (i10 >= 0 && i6 >= i10) {
            i6++;
        }
        return (n) l10.get(i6);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l10;
        boolean z10 = this.A;
        l lVar = this.f9772x;
        if (z10) {
            lVar.i();
            l10 = lVar.j;
        } else {
            l10 = lVar.l();
        }
        if (this.f9773y < 0) {
            return l10.size();
        }
        return l10.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i6) {
        return i6;
    }

    @Override // android.widget.Adapter
    public final View getView(int i6, View view, ViewGroup viewGroup) {
        int i10;
        boolean z10 = false;
        if (view == null) {
            view = this.B.inflate(this.C, viewGroup, false);
        }
        int i11 = getItem(i6).f9802b;
        int i12 = i6 - 1;
        if (i12 >= 0) {
            i10 = getItem(i12).f9802b;
        } else {
            i10 = i11;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f9772x.m() && i11 != i10) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        y yVar = (y) view;
        if (this.f9774z) {
            listMenuItemView.setForceShowIcon(true);
        }
        yVar.a(getItem(i6));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
