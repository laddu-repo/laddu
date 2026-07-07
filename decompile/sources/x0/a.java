package x0;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.google.android.gms.internal.measurement.b4;
import h8.c;
import nd.q;
import p.a3;
import p.c2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable {
    public int A;
    public b4 B;
    public c2 C;
    public q D;

    /* renamed from: x, reason: collision with root package name */
    public boolean f14454x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f14455y;

    /* renamed from: z, reason: collision with root package name */
    public Cursor f14456z;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f14456z;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                b4 b4Var = this.B;
                if (b4Var != null) {
                    cursor2.unregisterContentObserver(b4Var);
                }
                c2 c2Var = this.C;
                if (c2Var != null) {
                    cursor2.unregisterDataSetObserver(c2Var);
                }
            }
            this.f14456z = cursor;
            if (cursor != null) {
                b4 b4Var2 = this.B;
                if (b4Var2 != null) {
                    cursor.registerContentObserver(b4Var2);
                }
                c2 c2Var2 = this.C;
                if (c2Var2 != null) {
                    cursor.registerDataSetObserver(c2Var2);
                }
                this.A = cursor.getColumnIndexOrThrow("_id");
                this.f14454x = true;
                notifyDataSetChanged();
            } else {
                this.A = -1;
                this.f14454x = false;
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
        if (this.f14454x && (cursor = this.f14456z) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i6, View view, ViewGroup viewGroup) {
        if (this.f14454x) {
            this.f14456z.moveToPosition(i6);
            if (view == null) {
                a3 a3Var = (a3) this;
                view = a3Var.G.inflate(a3Var.F, viewGroup, false);
            }
            a(view, this.f14456z);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.D == null) {
            q qVar = new q();
            qVar.f9715b = this;
            this.D = qVar;
        }
        return this.D;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i6) {
        Cursor cursor;
        if (this.f14454x && (cursor = this.f14456z) != null) {
            cursor.moveToPosition(i6);
            return this.f14456z;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i6) {
        Cursor cursor;
        if (!this.f14454x || (cursor = this.f14456z) == null || !cursor.moveToPosition(i6)) {
            return 0L;
        }
        return this.f14456z.getLong(this.A);
    }

    @Override // android.widget.Adapter
    public View getView(int i6, View view, ViewGroup viewGroup) {
        if (this.f14454x) {
            if (this.f14456z.moveToPosition(i6)) {
                if (view == null) {
                    view = d(viewGroup);
                }
                a(view, this.f14456z);
                return view;
            }
            throw new IllegalStateException(c.i(i6, "couldn't move cursor to position "));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
