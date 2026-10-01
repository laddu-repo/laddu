package c2;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.os.Build;
import android.provider.Settings;
import android.util.SparseArray;
import db.c1;
import db.p0;
import db.q1;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public static final d f1782c = new d(db.k0.o(c.f1767d));

    /* renamed from: d, reason: collision with root package name */
    public static final c1 f1783d;

    /* renamed from: e, reason: collision with root package name */
    public static final db.n0 f1784e;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f1785a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final int f1786b;

    static {
        Object[] objArr = {2, 5, 6};
        db.r.c(3, objArr);
        f1783d = db.k0.h(3, objArr);
        b2.k kVar = new b2.k(4);
        kVar.u(5, 6);
        kVar.u(17, 6);
        kVar.u(7, 6);
        kVar.u(30, 10);
        kVar.u(18, 6);
        kVar.u(6, 8);
        kVar.u(8, 8);
        kVar.u(14, 8);
        f1784e = kVar.c();
    }

    public d(c1 c1Var) {
        for (int i6 = 0; i6 < c1Var.A; i6++) {
            c cVar = (c) c1Var.get(i6);
            this.f1785a.put(cVar.f1768a, cVar);
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f1785a.size(); i11++) {
            i10 = Math.max(i10, ((c) this.f1785a.valueAt(i11)).f1769b);
        }
        this.f1786b = i10;
    }

    public static c1 a(int[] iArr, int i6) {
        db.h0 j = db.k0.j();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i10 : iArr) {
            j.a(new c(i10, i6));
        }
        return j.g();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [db.e0, db.o0] */
    /* JADX WARN: Type inference failed for: r7v15, types: [db.e0, db.o0] */
    public static d b(Context context, Intent intent, r1.d dVar, k7.d dVar2) {
        k7.d dVar3;
        List audioDevicesForAttributes;
        boolean z10;
        int i6;
        boolean isDirectPlaybackSupported;
        AudioDeviceInfo[] audioDeviceInfoArr;
        int type;
        List directProfilesForAttributes;
        int encapsulationType;
        int format;
        int[] channelMasks;
        int[] channelMasks2;
        int i10 = 2;
        AudioManager l10 = s1.c.l(context);
        if (dVar2 != null) {
            dVar3 = dVar2;
        } else {
            dVar3 = null;
            if (Build.VERSION.SDK_INT >= 33) {
                audioDevicesForAttributes = l10.getAudioDevicesForAttributes((AudioAttributes) dVar.b().f11625a);
                if (!audioDevicesForAttributes.isEmpty()) {
                    dVar3 = new k7.d(android.support.v4.media.c.f(audioDevicesForAttributes.get(0)), i10);
                }
            }
        }
        int i11 = Build.VERSION.SDK_INT;
        db.n0 n0Var = f1784e;
        if (i11 >= 33 && (u1.a0.O(context) || (i11 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            directProfilesForAttributes = l10.getDirectProfilesForAttributes((AudioAttributes) dVar.b().f11625a);
            HashMap hashMap = new HashMap();
            hashMap.put(2, new HashSet(a8.f.D(12)));
            for (int i12 = 0; i12 < directProfilesForAttributes.size(); i12++) {
                AudioProfile b10 = b2.i.b(directProfilesForAttributes.get(i12));
                encapsulationType = b10.getEncapsulationType();
                if (encapsulationType != 1) {
                    format = b10.getFormat();
                    if (u1.a0.L(format) || n0Var.containsKey(Integer.valueOf(format))) {
                        if (hashMap.containsKey(Integer.valueOf(format))) {
                            Set set = (Set) hashMap.get(Integer.valueOf(format));
                            set.getClass();
                            channelMasks2 = b10.getChannelMasks();
                            set.addAll(a8.f.D(channelMasks2));
                        } else {
                            Integer valueOf = Integer.valueOf(format);
                            channelMasks = b10.getChannelMasks();
                            hashMap.put(valueOf, new HashSet(a8.f.D(channelMasks)));
                        }
                    }
                }
            }
            db.h0 j = db.k0.j();
            for (Map.Entry entry : hashMap.entrySet()) {
                j.a(new c(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
            }
            return new d(j.g());
        }
        if (i11 >= 23) {
            if (dVar3 == null) {
                audioDeviceInfoArr = l10.getDevices(2);
            } else {
                audioDeviceInfoArr = new AudioDeviceInfo[]{(AudioDeviceInfo) dVar3.f7747y};
            }
            ?? e0Var = new db.e0(4);
            e0Var.b(8, 7);
            if (i11 >= 31) {
                e0Var.b(26, 27);
            }
            if (i11 >= 33) {
                e0Var.a(30);
            }
            p0 g10 = e0Var.g();
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                type = audioDeviceInfo.getType();
                if (g10.contains(Integer.valueOf(type))) {
                    return f1782c;
                }
            }
        }
        ?? e0Var2 = new db.e0(4);
        e0Var2.a(2);
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 29 && (u1.a0.O(context) || (i13 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")))) {
            db.h0 j10 = db.k0.j();
            q1 it = n0Var.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int intValue = num.intValue();
                if (Build.VERSION.SDK_INT >= u1.a0.p(intValue)) {
                    isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), (AudioAttributes) dVar.b().f11625a);
                    if (isDirectPlaybackSupported) {
                        j10.a(num);
                    }
                }
            }
            j10.a(2);
            c1 g11 = j10.g();
            g11.getClass();
            e0Var2.d(g11);
            return new d(a(a8.f.U(e0Var2.g()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        if (Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            String str = Build.MANUFACTURER;
            if (!str.equals("Amazon") && !str.equals("Xiaomi")) {
                i6 = 1;
                if (intent == null && !z10 && intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == i6) {
                    int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
                    if (intArrayExtra != null) {
                        List D = a8.f.D(intArrayExtra);
                        D.getClass();
                        e0Var2.d(D);
                    }
                    return new d(a(a8.f.U(e0Var2.g()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
                }
                return new d(a(a8.f.U(e0Var2.g()), 10));
            }
        }
        i6 = 1;
        if (Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            c1 c1Var = f1783d;
            c1Var.getClass();
            e0Var2.d(c1Var);
        }
        if (intent == null) {
        }
        return new d(a(a8.f.U(e0Var2.g()), 10));
    }

    public static d c(Context context, r1.d dVar, k7.d dVar2) {
        return b(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), dVar, dVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0101, code lost:
    
        if (r11 != 5) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair d(r1.q r17, r1.d r18) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.d.d(r1.q, r1.d):android.util.Pair");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0014, code lost:
    
        if (r1 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            goto L54
        L4:
            boolean r1 = r9 instanceof c2.d
            r2 = 0
            if (r1 != 0) goto La
            goto L55
        La:
            c2.d r9 = (c2.d) r9
            android.util.SparseArray r1 = r9.f1785a
            java.lang.String r3 = u1.a0.f12750a
            android.util.SparseArray r3 = r8.f1785a
            if (r3 != 0) goto L1a
            if (r1 != 0) goto L18
        L16:
            r1 = 1
            goto L4c
        L18:
            r1 = 0
            goto L4c
        L1a:
            if (r1 != 0) goto L1d
            goto L18
        L1d:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            if (r4 < r5) goto L28
            boolean r1 = t0.e.i(r3, r1)
            goto L4c
        L28:
            int r4 = r3.size()
            int r5 = r1.size()
            if (r4 == r5) goto L33
            goto L18
        L33:
            r5 = 0
        L34:
            if (r5 >= r4) goto L16
            int r6 = r3.keyAt(r5)
            java.lang.Object r7 = r3.valueAt(r5)
            java.lang.Object r6 = r1.get(r6)
            boolean r6 = java.util.Objects.equals(r7, r6)
            if (r6 != 0) goto L49
            goto L18
        L49:
            int r5 = r5 + 1
            goto L34
        L4c:
            if (r1 == 0) goto L55
            int r1 = r8.f1786b
            int r9 = r9.f1786b
            if (r1 != r9) goto L55
        L54:
            return r0
        L55:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i6;
        String str = u1.a0.f12750a;
        int i10 = Build.VERSION.SDK_INT;
        SparseArray sparseArray = this.f1785a;
        if (i10 >= 31) {
            i6 = sparseArray.contentHashCode();
        } else {
            i6 = 17;
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                i6 = Objects.hashCode(sparseArray.valueAt(i11)) + ((sparseArray.keyAt(i11) + (i6 * 31)) * 31);
            }
        }
        return (i6 * 31) + this.f1786b;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f1786b + ", audioProfiles=" + this.f1785a + "]";
    }
}
