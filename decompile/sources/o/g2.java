package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class g2 extends r1 {
    public final int H;
    public final int I;
    public d2 J;
    public n.n K;

    public g2(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.H = 21;
            this.I = 22;
        } else {
            this.H = 22;
            this.I = 21;
        }
    }

    @Override // o.r1, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        n.i iVar;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.J != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                iVar = (n.i) headerViewListAdapter.getWrappedAdapter();
            } else {
                iVar = (n.i) adapter;
                headersCount = 0;
            }
            n.n nVarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= iVar.getCount()) ? null : iVar.getItem(i);
            n.n nVar = this.K;
            if (nVar != nVarB) {
                n.l lVar = iVar.f8888v;
                if (nVar != null) {
                    this.J.h(lVar, nVar);
                }
                this.K = nVarB;
                if (nVarB != null) {
                    this.J.n(lVar, nVarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.H) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.I) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (n.i) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (n.i) adapter).f8888v.c(false);
        return true;
    }

    public void setHoverListener(d2 d2Var) {
        this.J = d2Var;
    }

    @Override // o.r1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
