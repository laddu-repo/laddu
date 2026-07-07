package y0;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import d0.d;
import i5.f;
import o.z2;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends BaseAdapter implements Filterable {
    public f A;
    public c B;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14356v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f14357w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Cursor f14358x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f14359y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public a f14360z;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f14358x;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f14360z;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                f fVar = this.A;
                if (fVar != null) {
                    cursor2.unregisterDataSetObserver(fVar);
                }
            }
            this.f14358x = cursor;
            if (cursor != null) {
                a aVar2 = this.f14360z;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                f fVar2 = this.A;
                if (fVar2 != null) {
                    cursor.registerDataSetObserver(fVar2);
                }
                this.f14359y = cursor.getColumnIndexOrThrow("_id");
                this.f14356v = true;
                notifyDataSetChanged();
            } else {
                this.f14359y = -1;
                this.f14356v = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f14356v || (cursor = this.f14358x) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f14356v) {
            return null;
        }
        this.f14358x.moveToPosition(i);
        if (view == null) {
            z2 z2Var = (z2) this;
            view = z2Var.E.inflate(z2Var.D, viewGroup, false);
        }
        a(view, this.f14358x);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.B == null) {
            c cVar = new c();
            cVar.f14361a = this;
            this.B = cVar;
        }
        return this.B;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.f14356v || (cursor = this.f14358x) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f14358x;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.f14356v && (cursor = this.f14358x) != null && cursor.moveToPosition(i)) {
            return this.f14358x.getLong(this.f14359y);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f14356v) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f14358x.moveToPosition(i)) {
            throw new IllegalStateException(d.h(i, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f14358x);
        return view;
    }
}
