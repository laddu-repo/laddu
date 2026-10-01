package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class j2 extends t1 {
    public final int J;
    public final int K;
    public g2 L;
    public o.n M;

    public j2(Context context, boolean z10) {
        super(context, z10);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.J = 21;
            this.K = 22;
        } else {
            this.J = 22;
            this.K = 21;
        }
    }

    @Override // p.t1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        o.i iVar;
        int i6;
        o.n nVar;
        int pointToPosition;
        int i10;
        if (this.L != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i6 = headerViewListAdapter.getHeadersCount();
                iVar = (o.i) headerViewListAdapter.getWrappedAdapter();
            } else {
                iVar = (o.i) adapter;
                i6 = 0;
            }
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i10 = pointToPosition - i6) >= 0 && i10 < iVar.getCount()) {
                nVar = iVar.getItem(i10);
            } else {
                nVar = null;
            }
            o.n nVar2 = this.M;
            if (nVar2 != nVar) {
                o.l lVar = iVar.f9772x;
                if (nVar2 != null) {
                    this.L.d(lVar, nVar2);
                }
                this.M = nVar;
                if (nVar != null) {
                    this.L.n(lVar, nVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i6, KeyEvent keyEvent) {
        o.i iVar;
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i6 == this.J) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView != null && i6 == this.K) {
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                iVar = (o.i) ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            } else {
                iVar = (o.i) adapter;
            }
            iVar.f9772x.c(false);
            return true;
        }
        return super.onKeyDown(i6, keyEvent);
    }

    public void setHoverListener(g2 g2Var) {
        this.L = g2Var;
    }

    @Override // p.t1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
