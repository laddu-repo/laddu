package kb;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Rect;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.google.android.gms.internal.measurement.e3;
import com.google.android.gms.internal.measurement.f4;
import com.google.android.gms.internal.measurement.g3;
import com.google.android.gms.internal.measurement.n3;
import com.google.android.gms.internal.measurement.t3;
import j6.c0;
import j6.d0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k8.f0;
import k8.w;
import o9.m;
import org.json.JSONException;
import org.json.JSONObject;
import pd.s;
import s2.p;
import w1.b0;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public class e implements a6.g, b8.e, com.bumptech.glide.manager.f, p, d0, j7.a, w {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static e f7884w;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f7888v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ e f7885x = new e(17);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ e f7886y = new e(18);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ e f7887z = new e(19);
    public static final /* synthetic */ e A = new e(20);
    public static final /* synthetic */ e B = new e(21);
    public static final /* synthetic */ e C = new e(22);
    public static final /* synthetic */ e D = new e(23);
    public static final /* synthetic */ e E = new e(24);
    public static final /* synthetic */ e F = new e(25);
    public static final /* synthetic */ e G = new e(26);
    public static final /* synthetic */ e H = new e(27);
    public static final /* synthetic */ e I = new e(28);
    public static final /* synthetic */ e J = new e(29);

    public /* synthetic */ e(int i) {
        this.f7888v = i;
    }

    public static e e(Context context, int i) {
        u1.c.d("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, p8.l.MaterialCalendarItem);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(p8.l.MaterialCalendarItem_android_insetLeft, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(p8.l.MaterialCalendarItem_android_insetTop, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(p8.l.MaterialCalendarItem_android_insetRight, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(p8.l.MaterialCalendarItem_android_insetBottom, 0));
        com.bumptech.glide.c.p(context, typedArrayObtainStyledAttributes, p8.l.MaterialCalendarItem_itemFillColor);
        com.bumptech.glide.c.p(context, typedArrayObtainStyledAttributes, p8.l.MaterialCalendarItem_itemTextColor);
        com.bumptech.glide.c.p(context, typedArrayObtainStyledAttributes, p8.l.MaterialCalendarItem_itemStrokeColor);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(p8.l.MaterialCalendarItem_itemStrokeWidth, 0);
        m.a(context, typedArrayObtainStyledAttributes.getResourceId(p8.l.MaterialCalendarItem_itemShapeAppearance, 0), typedArrayObtainStyledAttributes.getResourceId(p8.l.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).a();
        typedArrayObtainStyledAttributes.recycle();
        e eVar = new e(10);
        u1.c.e(rect.left);
        u1.c.e(rect.top);
        u1.c.e(rect.right);
        u1.c.e(rect.bottom);
        return eVar;
    }

    public static jd.g f(String str) {
        de.i.e(str, "jsonString");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject = new JSONObject(str);
        Iterator<String> itKeys = jSONObject.keys();
        de.i.d(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            linkedHashMap.put(next, jSONObject.getString(next));
        }
        return new jd.g(linkedHashMap);
    }

    public static String h(jd.g gVar) throws JSONException {
        de.i.e(gVar, "extras");
        Map map = gVar.f7084v;
        if (map.isEmpty()) {
            return "{}";
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : s.T(map).entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        String string = jSONObject.toString();
        de.i.b(string);
        return string;
    }

    public static LinkedHashMap i(String str) {
        de.i.e(str, "jsonString");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject = new JSONObject(str);
        Iterator<String> itKeys = jSONObject.keys();
        de.i.d(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            linkedHashMap.put(next, jSONObject.getString(next));
        }
        return linkedHashMap;
    }

    public static Path l(float f, float f4, float f10, float f11) {
        Path path = new Path();
        path.moveTo(f, f4);
        path.lineTo(f10, f11);
        return path;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:93:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m(k1.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kb.e.m(k1.b, android.text.Editable, int, int, boolean):boolean");
    }

    public static String p(Map map) throws JSONException {
        de.i.e(map, "headerMap");
        if (map.isEmpty()) {
            return "{}";
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        String string = jSONObject.toString();
        de.i.b(string);
        return string;
    }

    @Override // k8.w
    public Object a() {
        switch (this.f7888v) {
            case 17:
                return new Boolean(((Boolean) n3.f2908a.get()).booleanValue());
            case 18:
                return new Boolean(((Boolean) f4.f2634a.get()).booleanValue());
            case 19:
                List list = f0.f7479a;
                return (String) t3.f3100a.get();
            case 20:
                List list2 = f0.f7479a;
                e3.f2605w.get();
                return Integer.valueOf((int) ((Long) g3.f2655a.g(72, 50000L, "measurement.upload.max_public_events_per_day").get()).longValue());
            case 21:
                List list3 = f0.f7479a;
                e3.f2605w.get();
                return (String) g3.f2655a.i(78, "measurement.upload.url", "https://app-measurement.com/a").get();
            case 22:
                List list4 = f0.f7479a;
                e3.f2605w.get();
                return (Long) g3.f2655a.g(51, 600000L, "measurement.sgtm.upload.retry_interval").get();
            case 23:
                List list5 = f0.f7479a;
                e3.f2605w.get();
                return (Long) g3.f2655a.g(43, 21600000L, "measurement.sgtm.batch.retry_max_wait").get();
            case 24:
                List list6 = f0.f7479a;
                e3.f2605w.get();
                return (Long) g3.f2655a.g(50, 5000L, "measurement.sgtm.upload.min_delay_after_startup").get();
            case 25:
                List list7 = f0.f7479a;
                e3.f2605w.get();
                return (Long) g3.f2655a.g(5, 86400000L, "measurement.config.cache_time").get();
            case 26:
                List list8 = f0.f7479a;
                e3.f2605w.get();
                return (Long) g3.f2655a.g(33, 10000L, "measurement.upload.realtime_upload_interval").get();
            case 27:
                List list9 = f0.f7479a;
                e3.f2605w.get();
                return (Long) g3.f2655a.g(53, 86400000L, "measurement.upload.stale_data_deletion_interval").get();
            case 28:
                List list10 = f0.f7479a;
                e3.f2605w.get();
                return (Long) g3.f2655a.g(77, 1800000L, "measurement.upload.retry_time").get();
            default:
                List list11 = f0.f7479a;
                e3.f2605w.get();
                return Integer.valueOf((int) ((Long) g3.f2655a.g(17, 4L, "measurement.lifetimevalue.max_currency_tracked").get()).longValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b A[PHI: r4
  0x001b: PHI (r4v2 int) = (r4v1 int), (r4v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // b8.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public b8.d c(android.content.Context r3, java.lang.String r4, b8.c r5) {
        /*
            r2 = this;
            b8.d r0 = new b8.d
            r0.<init>()
            int r1 = r5.g(r3, r4)
            r0.f1575a = r1
            r1 = 1
            int r3 = r5.b(r3, r4, r1)
            r0.f1576b = r3
            int r4 = r0.f1575a
            if (r4 != 0) goto L1b
            r4 = 0
            if (r3 != 0) goto L1b
            r1 = r4
            goto L1e
        L1b:
            if (r4 < r3) goto L1e
            r1 = -1
        L1e:
            r0.f1577c = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kb.e.c(android.content.Context, java.lang.String, b8.c):b8.d");
    }

    @Override // j7.a
    public long d() {
        return System.currentTimeMillis();
    }

    @Override // s2.p
    public Object j(Uri uri, y1.j jVar) {
        return Long.valueOf(b0.P(new BufferedReader(new InputStreamReader(jVar)).readLine()));
    }

    @Override // j6.d0
    public void k(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(new c0((ByteBuffer) obj));
    }

    public boolean n(CharSequence charSequence) {
        return false;
    }

    @Override // j6.d0
    public void o(MediaExtractor mediaExtractor, Object obj) throws IOException {
        mediaExtractor.setDataSource(new c0((ByteBuffer) obj));
    }

    public e(Context context) {
        this.f7888v = 7;
    }

    @Override // com.bumptech.glide.manager.f
    public void b(h.j jVar) {
    }

    @Override // a6.g
    public void g(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }
}
