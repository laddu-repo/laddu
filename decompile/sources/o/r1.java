package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class r1 extends ListView {
    public int A;
    public p1 B;
    public boolean C;
    public final boolean D;
    public boolean E;
    public x0.d F;
    public androidx.fragment.app.m G;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Rect f9285v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f9286w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f9287x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f9288y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f9289z;

    public r1(Context context, boolean z2) {
        super(context, null, g.a.dropDownListViewStyle);
        this.f9285v = new Rect();
        this.f9286w = 0;
        this.f9287x = 0;
        this.f9288y = 0;
        this.f9289z = 0;
        this.D = z2;
        setCacheColorHint(0);
    }

    public final int a(int i, int i10) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i11 = 0;
        View view = null;
        for (int i12 = 0; i12 < count; i12++) {
            int itemViewType = adapter.getItemViewType(i12);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            view = adapter.getView(i12, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i13 = layoutParams.height;
            view.measure(i, i13 > 0 ? View.MeasureSpec.makeMeasureSpec(i13, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i12 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i10) {
                return i10;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(android.view.MotionEvent r18, int r19) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.r1.b(android.view.MotionEvent, int):boolean");
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f9285v;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.G != null) {
            return;
        }
        super.drawableStateChanged();
        p1 p1Var = this.B;
        if (p1Var != null) {
            p1Var.f9266w = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.E && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.D || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.D || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.D || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.D && this.C) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.G = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.G == null) {
            androidx.fragment.app.m mVar = new androidx.fragment.app.m(19, this);
            this.G = mVar;
            post(mVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i < 30 || !n1.f9242d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        n1.f9239a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        n1.f9240b.invoke(this, Integer.valueOf(iPointToPosition));
                        n1.f9241c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e7) {
                        e7.printStackTrace();
                    } catch (InvocationTargetException e10) {
                        e10.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.E && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.A = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        androidx.fragment.app.m mVar = this.G;
        if (mVar != null) {
            r1 r1Var = (r1) mVar.f1051w;
            r1Var.G = null;
            r1Var.removeCallbacks(mVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z2) {
        this.C = z2;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        p1 p1Var;
        if (drawable != null) {
            p1Var = new p1();
            Drawable drawable2 = p1Var.f9265v;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            p1Var.f9265v = drawable;
            if (drawable != null) {
                drawable.setCallback(p1Var);
            }
            p1Var.f9266w = true;
        } else {
            p1Var = null;
        }
        this.B = p1Var;
        super.setSelector(p1Var);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f9286w = rect.left;
        this.f9287x = rect.top;
        this.f9288y = rect.right;
        this.f9289z = rect.bottom;
    }
}
