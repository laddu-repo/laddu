package w5;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import okhttp3.HttpUrl;
import u1.t;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class a implements w8.c {

    /* renamed from: x, reason: collision with root package name */
    public final Object f14086x;

    public a(u8.d dVar) {
        this.f14086x = dVar;
    }

    @Override // w8.c
    public void a(t8.b bVar) {
        ((u8.d) this.f14086x).a(bVar);
    }

    public void b(b5.a migration) {
        kotlin.jvm.internal.k.e(migration, "migration");
        int i6 = migration.f1472a;
        int i10 = migration.f1473b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f14086x;
        Integer valueOf = Integer.valueOf(i6);
        Object obj = linkedHashMap.get(valueOf);
        if (obj == null) {
            obj = new TreeMap();
            linkedHashMap.put(valueOf, obj);
        }
        TreeMap treeMap = (TreeMap) obj;
        if (treeMap.containsKey(Integer.valueOf(i10))) {
            Log.w("ROOM", "Overriding migration " + treeMap.get(Integer.valueOf(i10)) + " with " + migration);
        }
        treeMap.put(Integer.valueOf(i10), migration);
    }

    public synchronized void c() {
        try {
            long j = ((SharedPreferences) this.f14086x).getLong("fire-count", 0L);
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            String str2 = null;
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f14086x).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    for (String str3 : (Set) entry.getValue()) {
                        if (str2 != null && str2.compareTo(str3) <= 0) {
                        }
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
            HashSet hashSet = new HashSet(((SharedPreferences) this.f14086x).getStringSet(str, new HashSet()));
            hashSet.remove(str2);
            ((SharedPreferences) this.f14086x).edit().putStringSet(str, hashSet).putLong("fire-count", j - 1).commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void d() {
        try {
            SharedPreferences.Editor edit = ((SharedPreferences) this.f14086x).edit();
            int i6 = 0;
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f14086x).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    Set set = (Set) entry.getValue();
                    String f3 = f(System.currentTimeMillis());
                    String key = entry.getKey();
                    if (set.contains(f3)) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(f3);
                        i6++;
                        edit.putStringSet(key, hashSet);
                    } else {
                        edit.remove(key);
                    }
                }
            }
            if (i6 == 0) {
                edit.remove("fire-count");
            } else {
                edit.putLong("fire-count", i6);
            }
            edit.commit();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized ArrayList e() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f14086x).getAll().entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(f(System.currentTimeMillis()));
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new zb.a(entry.getKey(), new ArrayList(hashSet)));
                    }
                }
            }
            n(System.currentTimeMillis());
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public synchronized String f(long j) {
        Instant instant;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        String format;
        ZoneOffset unused;
        DateTimeFormatter unused2;
        if (Build.VERSION.SDK_INT >= 26) {
            instant = new Date(j).toInstant();
            unused = ZoneOffset.UTC;
            atOffset = instant.atOffset(ZoneOffset.UTC);
            localDateTime = atOffset.toLocalDateTime();
            unused2 = DateTimeFormatter.ISO_LOCAL_DATE;
            format = localDateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
            return format;
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public synchronized String g(String str) {
        for (Map.Entry<String, ?> entry : ((SharedPreferences) this.f14086x).getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public synchronized boolean h(long j, long j10) {
        return f(j).equals(f(j10));
    }

    public synchronized void i() {
        String f3 = f(System.currentTimeMillis());
        ((SharedPreferences) this.f14086x).edit().putString("last-used-date", f3).commit();
        j(f3);
    }

    public synchronized void j(String str) {
        try {
            String g10 = g(str);
            if (g10 == null) {
                return;
            }
            HashSet hashSet = new HashSet(((SharedPreferences) this.f14086x).getStringSet(g10, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                ((SharedPreferences) this.f14086x).edit().remove(g10).commit();
            } else {
                ((SharedPreferences) this.f14086x).edit().putStringSet(g10, hashSet).commit();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean k(long j) {
        return l(j);
    }

    public synchronized boolean l(long j) {
        if (((SharedPreferences) this.f14086x).contains("fire-global")) {
            if (!h(((SharedPreferences) this.f14086x).getLong("fire-global", -1L), j)) {
                ((SharedPreferences) this.f14086x).edit().putLong("fire-global", j).commit();
                return true;
            }
            return false;
        }
        ((SharedPreferences) this.f14086x).edit().putLong("fire-global", j).commit();
        return true;
    }

    public synchronized void m(String str, long j) {
        String f3 = f(j);
        if (((SharedPreferences) this.f14086x).getString("last-used-date", HttpUrl.FRAGMENT_ENCODE_SET).equals(f3)) {
            String g10 = g(f3);
            if (g10 == null) {
                return;
            }
            if (g10.equals(str)) {
                return;
            }
            o(str, f3);
            return;
        }
        long j10 = ((SharedPreferences) this.f14086x).getLong("fire-count", 0L);
        if (j10 + 1 == 30) {
            c();
            j10 = ((SharedPreferences) this.f14086x).getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(((SharedPreferences) this.f14086x).getStringSet(str, new HashSet()));
        hashSet.add(f3);
        ((SharedPreferences) this.f14086x).edit().putStringSet(str, hashSet).putLong("fire-count", j10 + 1).putString("last-used-date", f3).commit();
    }

    public synchronized void n(long j) {
        ((SharedPreferences) this.f14086x).edit().putLong("fire-global", j).commit();
    }

    public synchronized void o(String str, String str2) {
        j(str2);
        HashSet hashSet = new HashSet(((SharedPreferences) this.f14086x).getStringSet(str, new HashSet()));
        hashSet.add(str2);
        ((SharedPreferences) this.f14086x).edit().putStringSet(str, hashSet).commit();
    }

    public a(int i6) {
        Handler handler;
        Handler handler2;
        switch (i6) {
            case 2:
                this.f14086x = new LinkedHashMap();
                return;
            case 3:
                this.f14086x = new t(10);
                return;
            default:
                Looper mainLooper = Looper.getMainLooper();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler2 = j0.a.a(mainLooper);
                } else {
                    try {
                        handler = (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(mainLooper, null, Boolean.TRUE);
                    } catch (IllegalAccessException e10) {
                        e = e10;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f14086x = handler2;
                        return;
                    } catch (InstantiationException e11) {
                        e = e11;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f14086x = handler2;
                        return;
                    } catch (NoSuchMethodException e12) {
                        e = e12;
                        Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
                        handler = new Handler(mainLooper);
                        handler2 = handler;
                        this.f14086x = handler2;
                        return;
                    } catch (InvocationTargetException e13) {
                        Throwable cause = e13.getCause();
                        if (!(cause instanceof RuntimeException)) {
                            if (cause instanceof Error) {
                                throw ((Error) cause);
                            }
                            throw new RuntimeException(cause);
                        }
                        throw ((RuntimeException) cause);
                    }
                    handler2 = handler;
                }
                this.f14086x = handler2;
                return;
        }
    }

    public a(Context context, String str) {
        this.f14086x = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }
}
