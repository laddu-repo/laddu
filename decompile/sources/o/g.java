package o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.playfy.tv.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class g extends BaseAdapter {

    /* renamed from: x, reason: collision with root package name */
    public int f9767x = -1;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h f9768y;

    public g(h hVar) {
        this.f9768y = hVar;
        a();
    }

    public final void a() {
        l lVar = this.f9768y.f9771z;
        n nVar = lVar.f9795v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.j;
            int size = arrayList.size();
            for (int i6 = 0; i6 < size; i6++) {
                if (((n) arrayList.get(i6)) == nVar) {
                    this.f9767x = i6;
                    return;
                }
            }
        }
        this.f9767x = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final n getItem(int i6) {
        h hVar = this.f9768y;
        l lVar = hVar.f9771z;
        lVar.i();
        ArrayList arrayList = lVar.j;
        hVar.getClass();
        int i10 = this.f9767x;
        if (i10 >= 0 && i6 >= i10) {
            i6++;
        }
        return (n) arrayList.get(i6);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        h hVar = this.f9768y;
        l lVar = hVar.f9771z;
        lVar.i();
        int size = lVar.j.size();
        hVar.getClass();
        if (this.f9767x < 0) {
            return size;
        }
        return size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i6) {
        return i6;
    }

    @Override // android.widget.Adapter
    public final View getView(int i6, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f9768y.f9770y.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((y) view).a(getItem(i6));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
