package kb;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.l1;
import com.google.android.gms.internal.measurement.y0;
import com.google.android.gms.internal.measurement.z0;
import com.unity3d.ads.metadata.MediationMetaData;
import db.c1;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import n9.a2;
import okhttp3.HttpUrl;
import u5.r;
import w8.x;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final bc.a f7812a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f7813b = null;

    public c(bc.a aVar) {
        this.f7812a = aVar;
    }

    public static boolean a(ArrayList arrayList, b bVar) {
        String str = bVar.f7806a;
        String str2 = bVar.f7807b;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Object obj = arrayList.get(i6);
            i6++;
            b bVar2 = (b) obj;
            if (bVar2.f7806a.equals(str) && bVar2.f7807b.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [nb.a, java.lang.Object] */
    public final ArrayList b() {
        nb.c cVar = (nb.c) ((nb.b) this.f7812a.get());
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : ((l1) cVar.f9588a.f12916y).f("frc", HttpUrl.FRAGMENT_ENCODE_SET)) {
            c1 c1Var = ob.b.f10041a;
            x.g(bundle);
            ?? obj = new Object();
            String str = (String) a2.e(bundle, "origin", String.class, null);
            x.g(str);
            obj.f9573a = str;
            String str2 = (String) a2.e(bundle, MediationMetaData.KEY_NAME, String.class, null);
            x.g(str2);
            obj.f9574b = str2;
            obj.f9575c = a2.e(bundle, "value", Object.class, null);
            obj.f9576d = (String) a2.e(bundle, "trigger_event_name", String.class, null);
            obj.f9577e = ((Long) a2.e(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            obj.f9578f = (String) a2.e(bundle, "timed_out_event_name", String.class, null);
            obj.f9579g = (Bundle) a2.e(bundle, "timed_out_event_params", Bundle.class, null);
            obj.f9580h = (String) a2.e(bundle, "triggered_event_name", String.class, null);
            obj.f9581i = (Bundle) a2.e(bundle, "triggered_event_params", Bundle.class, null);
            obj.j = ((Long) a2.e(bundle, "time_to_live", Long.class, 0L)).longValue();
            obj.f9582k = (String) a2.e(bundle, "expired_event_name", String.class, null);
            obj.f9583l = (Bundle) a2.e(bundle, "expired_event_params", Bundle.class, null);
            obj.f9585n = ((Boolean) a2.e(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            obj.f9584m = ((Long) a2.e(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            obj.f9586o = ((Long) a2.e(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(obj);
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [android.os.Bundle, java.lang.String] */
    public final void c(ArrayList arrayList) {
        ObjectOutputStream objectOutputStream;
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2;
        String str;
        String str2;
        String str3;
        String str4;
        bc.a aVar = this.f7812a;
        if (aVar.get() != null) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i6 = 0;
            int i10 = 0;
            while (true) {
                String str5 = HttpUrl.FRAGMENT_ENCODE_SET;
                if (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    Map map = (Map) obj;
                    String[] strArr = b.f7804g;
                    ArrayList arrayList3 = new ArrayList();
                    String[] strArr2 = b.f7804g;
                    for (int i11 = 0; i11 < 5; i11++) {
                        String str6 = strArr2[i11];
                        if (!map.containsKey(str6)) {
                            arrayList3.add(str6);
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        try {
                            Date parse = b.f7805h.parse((String) map.get("experimentStartTime"));
                            long parseLong = Long.parseLong((String) map.get("triggerTimeoutMillis"));
                            long parseLong2 = Long.parseLong((String) map.get("timeToLiveMillis"));
                            String str7 = (String) map.get("experimentId");
                            String str8 = (String) map.get("variantId");
                            if (map.containsKey("triggerEvent")) {
                                str5 = (String) map.get("triggerEvent");
                            }
                            arrayList2.add(new b(str7, str8, str5, parse, parseLong, parseLong2));
                        } catch (NumberFormatException e10) {
                            throw new Exception("Could not process experiment: one of the durations could not be converted into a long.", e10);
                        } catch (ParseException e11) {
                            throw new Exception("Could not process experiment: parsing experiment start time failed.", e11);
                        }
                    } else {
                        throw new Exception(String.format("The following keys are missing from the experiment info map: %s", arrayList3));
                    }
                } else {
                    Object obj2 = null;
                    if (arrayList2.isEmpty()) {
                        if (aVar.get() != null) {
                            ArrayList b10 = b();
                            int size2 = b10.size();
                            while (i6 < size2) {
                                Object obj3 = b10.get(i6);
                                i6++;
                                String str9 = ((nb.a) obj3).f9574b;
                                l1 l1Var = (l1) ((nb.c) ((nb.b) aVar.get())).f9588a.f12916y;
                                l1Var.c(new z0(l1Var, str9, null, null, 0));
                            }
                            return;
                        }
                        throw new Exception("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                    }
                    if (aVar.get() != null) {
                        ArrayList b11 = b();
                        ArrayList arrayList4 = new ArrayList();
                        int size3 = b11.size();
                        int i12 = 0;
                        while (i12 < size3) {
                            Object obj4 = b11.get(i12);
                            i12++;
                            nb.a aVar2 = (nb.a) obj4;
                            String[] strArr3 = b.f7804g;
                            String str10 = aVar2.f9576d;
                            if (str10 != null) {
                                str4 = str10;
                            } else {
                                str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            arrayList4.add(new b(aVar2.f9574b, String.valueOf(aVar2.f9575c), str4, new Date(aVar2.f9584m), aVar2.f9577e, aVar2.j));
                            size3 = size3;
                            obj2 = obj2;
                        }
                        ?? r22 = obj2;
                        ArrayList arrayList5 = new ArrayList();
                        int size4 = arrayList4.size();
                        int i13 = 0;
                        while (i13 < size4) {
                            Object obj5 = arrayList4.get(i13);
                            i13++;
                            b bVar = (b) obj5;
                            if (!a(arrayList2, bVar)) {
                                arrayList5.add(bVar.a());
                            }
                        }
                        int size5 = arrayList5.size();
                        int i14 = 0;
                        while (i14 < size5) {
                            Object obj6 = arrayList5.get(i14);
                            i14++;
                            String str11 = ((nb.a) obj6).f9574b;
                            l1 l1Var2 = (l1) ((nb.c) ((nb.b) aVar.get())).f9588a.f12916y;
                            l1Var2.c(new z0(l1Var2, str11, r22, r22, 0));
                        }
                        ArrayList arrayList6 = new ArrayList();
                        int size6 = arrayList2.size();
                        int i15 = 0;
                        while (i15 < size6) {
                            Object obj7 = arrayList2.get(i15);
                            i15++;
                            b bVar2 = (b) obj7;
                            if (!a(arrayList4, bVar2)) {
                                arrayList6.add(bVar2);
                            }
                        }
                        ArrayDeque arrayDeque = new ArrayDeque(b());
                        if (this.f7813b == null) {
                            this.f7813b = Integer.valueOf(((l1) ((nb.c) ((nb.b) aVar.get())).f9588a.f12916y).b("frc"));
                        }
                        int intValue = this.f7813b.intValue();
                        int size7 = arrayList6.size();
                        int i16 = 0;
                        while (i16 < size7) {
                            int i17 = i16 + 1;
                            b bVar3 = (b) arrayList6.get(i16);
                            while (arrayDeque.size() >= intValue) {
                                String str12 = ((nb.a) arrayDeque.pollFirst()).f9574b;
                                l1 l1Var3 = (l1) ((nb.c) ((nb.b) aVar.get())).f9588a.f12916y;
                                l1Var3.c(new z0(l1Var3, str12, r22, r22, 0));
                            }
                            nb.a a10 = bVar3.a();
                            nb.c cVar = (nb.c) ((nb.b) aVar.get());
                            cVar.getClass();
                            c1 c1Var = ob.b.f10041a;
                            String str13 = a10.f9573a;
                            if (!str13.isEmpty()) {
                                Object obj8 = a10.f9575c;
                                if (obj8 != null) {
                                    try {
                                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                        objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                        try {
                                            objectOutputStream.writeObject(obj8);
                                            objectOutputStream.flush();
                                            objectInputStream2 = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                                        } catch (Throwable th) {
                                            th = th;
                                            objectInputStream = r22;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        objectOutputStream = r22;
                                        objectInputStream = objectOutputStream;
                                    }
                                    try {
                                        Object obj9 = objectInputStream2.readObject();
                                        try {
                                            objectOutputStream.close();
                                            objectInputStream2.close();
                                        } catch (IOException | ClassNotFoundException unused) {
                                            obj9 = r22;
                                        }
                                        if (obj9 == null) {
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        objectInputStream = objectInputStream2;
                                        if (objectOutputStream != null) {
                                            objectOutputStream.close();
                                        }
                                        if (objectInputStream != 0) {
                                            objectInputStream.close();
                                        }
                                        throw th;
                                        break;
                                    }
                                }
                                if (!ob.b.f10042b.contains(str13) && ob.b.b(str13, a10.f9574b) && (((str = a10.f9582k) == null || (ob.b.a(str, a10.f9583l) && ob.b.c(str13, a10.f9582k, a10.f9583l))) && (((str2 = a10.f9580h) == null || (ob.b.a(str2, a10.f9581i) && ob.b.c(str13, a10.f9580h, a10.f9581i))) && ((str3 = a10.f9578f) == null || (ob.b.a(str3, a10.f9579g) && ob.b.c(str13, a10.f9578f, a10.f9579g)))))) {
                                    r rVar = cVar.f9588a;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("origin", a10.f9573a);
                                    String str14 = a10.f9574b;
                                    if (str14 != null) {
                                        bundle.putString(MediationMetaData.KEY_NAME, str14);
                                    }
                                    Object obj10 = a10.f9575c;
                                    if (obj10 != null) {
                                        a2.c(bundle, obj10);
                                    }
                                    String str15 = a10.f9576d;
                                    if (str15 != null) {
                                        bundle.putString("trigger_event_name", str15);
                                    }
                                    bundle.putLong("trigger_timeout", a10.f9577e);
                                    String str16 = a10.f9578f;
                                    if (str16 != null) {
                                        bundle.putString("timed_out_event_name", str16);
                                    }
                                    Bundle bundle2 = a10.f9579g;
                                    if (bundle2 != null) {
                                        bundle.putBundle("timed_out_event_params", bundle2);
                                    }
                                    String str17 = a10.f9580h;
                                    if (str17 != null) {
                                        bundle.putString("triggered_event_name", str17);
                                    }
                                    Bundle bundle3 = a10.f9581i;
                                    if (bundle3 != null) {
                                        bundle.putBundle("triggered_event_params", bundle3);
                                    }
                                    bundle.putLong("time_to_live", a10.j);
                                    String str18 = a10.f9582k;
                                    if (str18 != null) {
                                        bundle.putString("expired_event_name", str18);
                                    }
                                    Bundle bundle4 = a10.f9583l;
                                    if (bundle4 != null) {
                                        bundle.putBundle("expired_event_params", bundle4);
                                    }
                                    bundle.putLong("creation_timestamp", a10.f9584m);
                                    bundle.putBoolean("active", a10.f9585n);
                                    bundle.putLong("triggered_timestamp", a10.f9586o);
                                    l1 l1Var4 = (l1) rVar.f12916y;
                                    l1Var4.c(new y0(l1Var4, bundle));
                                }
                            }
                            arrayDeque.offer(a10);
                            i16 = i17;
                        }
                        return;
                    }
                    throw new Exception("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                }
            }
        } else {
            throw new Exception("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }
}
