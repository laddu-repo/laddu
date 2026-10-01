package u0;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.protobuf.CodedOutputStream;
import okhttp3.internal.http2.Http2;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f12733e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f12734f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f12735g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f12736h;

    /* renamed from: i, reason: collision with root package name */
    public static final b f12737i;
    public static final b j;

    /* renamed from: k, reason: collision with root package name */
    public static final b f12738k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f12739l;

    /* renamed from: a, reason: collision with root package name */
    public final Object f12740a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12741b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f12742c;

    /* renamed from: d, reason: collision with root package name */
    public final m f12743d;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction24;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction25;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction26;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction27;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction28;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction29;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction30;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction31;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction32;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction33;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction34;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction35;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction36;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction37 = null;
        new b(1, (String) null);
        new b(2, (String) null);
        new b(4, (String) null);
        new b(8, (String) null);
        f12733e = new b(16, (String) null);
        new b(32, (String) null);
        new b(64, (String) null);
        new b(128, (String) null);
        new b(256, f.class);
        new b(512, f.class);
        new b(1024, g.class);
        new b(2048, g.class);
        f12734f = new b(CodedOutputStream.DEFAULT_BUFFER_SIZE, (String) null);
        f12735g = new b(8192, (String) null);
        new b(Http2.INITIAL_MAX_FRAME_SIZE, (String) null);
        new b(32768, (String) null);
        new b(65536, (String) null);
        new b(131072, k.class);
        f12736h = new b(262144, (String) null);
        f12737i = new b(524288, (String) null);
        j = new b(1048576, (String) null);
        new b(2097152, l.class);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 23) {
            accessibilityAction36 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
            accessibilityAction = accessibilityAction36;
        } else {
            accessibilityAction = null;
        }
        new b(accessibilityAction, R.id.accessibilityActionShowOnScreen, null, null, null);
        if (i6 >= 23) {
            accessibilityAction35 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
            accessibilityAction2 = accessibilityAction35;
        } else {
            accessibilityAction2 = null;
        }
        new b(accessibilityAction2, R.id.accessibilityActionScrollToPosition, null, null, i.class);
        if (i6 >= 23) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
        } else {
            accessibilityAction3 = null;
        }
        f12738k = new b(accessibilityAction3, R.id.accessibilityActionScrollUp, null, null, null);
        if (i6 >= 23) {
            accessibilityAction34 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
            accessibilityAction4 = accessibilityAction34;
        } else {
            accessibilityAction4 = null;
        }
        new b(accessibilityAction4, R.id.accessibilityActionScrollLeft, null, null, null);
        if (i6 >= 23) {
            accessibilityAction33 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
            accessibilityAction5 = accessibilityAction33;
        } else {
            accessibilityAction5 = null;
        }
        f12739l = new b(accessibilityAction5, R.id.accessibilityActionScrollDown, null, null, null);
        if (i6 >= 23) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
        } else {
            accessibilityAction6 = null;
        }
        new b(accessibilityAction6, R.id.accessibilityActionScrollRight, null, null, null);
        if (i6 >= 29) {
            accessibilityAction32 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
            accessibilityAction7 = accessibilityAction32;
        } else {
            accessibilityAction7 = null;
        }
        new b(accessibilityAction7, R.id.accessibilityActionPageUp, null, null, null);
        if (i6 >= 29) {
            accessibilityAction31 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction8 = accessibilityAction31;
        } else {
            accessibilityAction8 = null;
        }
        new b(accessibilityAction8, R.id.accessibilityActionPageDown, null, null, null);
        if (i6 >= 29) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction9 = null;
        }
        new b(accessibilityAction9, R.id.accessibilityActionPageLeft, null, null, null);
        if (i6 >= 29) {
            accessibilityAction30 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction10 = accessibilityAction30;
        } else {
            accessibilityAction10 = null;
        }
        new b(accessibilityAction10, R.id.accessibilityActionPageRight, null, null, null);
        if (i6 >= 23) {
            accessibilityAction29 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
            accessibilityAction11 = accessibilityAction29;
        } else {
            accessibilityAction11 = null;
        }
        new b(accessibilityAction11, R.id.accessibilityActionContextClick, null, null, null);
        if (i6 >= 24) {
            accessibilityAction28 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
            accessibilityAction12 = accessibilityAction28;
        } else {
            accessibilityAction12 = null;
        }
        new b(accessibilityAction12, R.id.accessibilityActionSetProgress, null, null, j.class);
        if (i6 >= 26) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction13 = null;
        }
        new b(accessibilityAction13, R.id.accessibilityActionMoveWindow, null, null, h.class);
        if (i6 >= 28) {
            accessibilityAction27 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction14 = accessibilityAction27;
        } else {
            accessibilityAction14 = null;
        }
        new b(accessibilityAction14, R.id.accessibilityActionShowTooltip, null, null, null);
        if (i6 >= 28) {
            accessibilityAction26 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction15 = accessibilityAction26;
        } else {
            accessibilityAction15 = null;
        }
        new b(accessibilityAction15, R.id.accessibilityActionHideTooltip, null, null, null);
        if (i6 >= 30) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction16 = null;
        }
        new b(accessibilityAction16, R.id.accessibilityActionPressAndHold, null, null, null);
        if (i6 >= 30) {
            accessibilityAction25 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction17 = accessibilityAction25;
        } else {
            accessibilityAction17 = null;
        }
        new b(accessibilityAction17, R.id.accessibilityActionImeEnter, null, null, null);
        if (i6 >= 32) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction18 = null;
        }
        new b(accessibilityAction18, R.id.ALT, null, null, null);
        if (i6 >= 32) {
            accessibilityAction24 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction19 = accessibilityAction24;
        } else {
            accessibilityAction19 = null;
        }
        new b(accessibilityAction19, R.id.CTRL, null, null, null);
        if (i6 >= 32) {
            accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction20 = accessibilityAction23;
        } else {
            accessibilityAction20 = null;
        }
        new b(accessibilityAction20, R.id.FUNCTION, null, null, null);
        if (i6 >= 33) {
            accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction21 = accessibilityAction22;
        } else {
            accessibilityAction21 = null;
        }
        new b(accessibilityAction21, R.id.KEYCODE_0, null, null, null);
        if (i6 >= 34) {
            accessibilityAction37 = d.a.a();
        }
        new b(accessibilityAction37, R.id.KEYCODE_3D_MODE, null, null, null);
    }

    public b(int i6, String str) {
        this(null, i6, str, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f12740a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        Object obj2 = ((b) obj).f12740a;
        Object obj3 = this.f12740a;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        }
        if (!obj3.equals(obj2)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object obj = this.f12740a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
        String d10 = c.d(this.f12741b);
        if (d10.equals("ACTION_UNKNOWN")) {
            Object obj = this.f12740a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                d10 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb2.append(d10);
        return sb2.toString();
    }

    public b(int i6, Class cls) {
        this(null, i6, null, null, cls);
    }

    public b(Object obj, int i6, CharSequence charSequence, m mVar, Class cls) {
        this.f12741b = i6;
        this.f12743d = mVar;
        if (obj == null) {
            this.f12740a = new AccessibilityNodeInfo.AccessibilityAction(i6, charSequence);
        } else {
            this.f12740a = obj;
        }
        this.f12742c = cls;
    }
}
