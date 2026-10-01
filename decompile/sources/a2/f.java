package a2;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final cb.l f218a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f219b;

    /* renamed from: c, reason: collision with root package name */
    public w0 f220c;

    /* renamed from: d, reason: collision with root package name */
    public r1.d f221d;

    /* renamed from: f, reason: collision with root package name */
    public int f223f;

    /* renamed from: h, reason: collision with root package name */
    public s1.b f225h;

    /* renamed from: g, reason: collision with root package name */
    public float f224g = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public int f222e = 0;

    public f(Context context, Looper looper, w0 w0Var) {
        this.f218a = lg.c.l(new e(context, 0));
        this.f220c = w0Var;
        this.f219b = new Handler(looper);
    }

    public final void a() {
        int i6 = this.f222e;
        if (i6 != 1 && i6 != 0 && this.f225h != null) {
            AudioManager audioManager = (AudioManager) this.f218a.get();
            s1.b bVar = this.f225h;
            if (Build.VERSION.SDK_INT >= 26) {
                Object obj = bVar.f11971f;
                obj.getClass();
                audioManager.abandonAudioFocusRequest(m6.b.m(obj));
                return;
            }
            audioManager.abandonAudioFocus(bVar.f11967b);
        }
    }

    public final void b(int i6) {
        w0 w0Var = this.f220c;
        if (w0Var != null) {
            u1.x xVar = w0Var.E;
            xVar.getClass();
            u1.w b10 = u1.x.b();
            b10.f12818a = xVar.f12820a.obtainMessage(33, i6, 0);
            b10.b();
        }
    }

    public final void c(int i6) {
        float f3;
        if (this.f222e != i6) {
            this.f222e = i6;
            if (i6 == 4) {
                f3 = 0.2f;
            } else {
                f3 = 1.0f;
            }
            if (this.f224g != f3) {
                this.f224g = f3;
                w0 w0Var = this.f220c;
                if (w0Var != null) {
                    w0Var.E.e(34);
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r13v9, types: [java.lang.Object, ja.b] */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Object, ja.b] */
    public final int d(int i6, boolean z10) {
        int i10;
        int requestAudioFocus;
        ja.b bVar;
        boolean z11;
        int i11 = 0;
        if (i6 != 1 && (i10 = this.f223f) == 1) {
            if (z10) {
                if (this.f222e != 2) {
                    s1.b bVar2 = this.f225h;
                    if (bVar2 == null) {
                        if (bVar2 == null) {
                            ?? obj = new Object();
                            obj.f7319c = r1.d.f11342h;
                            obj.f7318b = i10;
                            bVar = obj;
                        } else {
                            ?? obj2 = new Object();
                            obj2.f7318b = bVar2.f11966a;
                            obj2.f7319c = bVar2.f11969d;
                            obj2.f7317a = bVar2.f11970e;
                            bVar = obj2;
                        }
                        r1.d dVar = this.f221d;
                        if (dVar != null && dVar.f11348a == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        dVar.getClass();
                        bVar.f7319c = dVar;
                        bVar.f7317a = z11;
                        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: a2.d
                            @Override // android.media.AudioManager.OnAudioFocusChangeListener
                            public final void onAudioFocusChange(int i12) {
                                r1.d dVar2;
                                f fVar = f.this;
                                fVar.getClass();
                                if (i12 != -3 && i12 != -2) {
                                    if (i12 != -1) {
                                        if (i12 != 1) {
                                            h8.c.p(i12, "Unknown focus change type: ", "AudioFocusManager");
                                            return;
                                        } else {
                                            fVar.c(2);
                                            fVar.b(1);
                                            return;
                                        }
                                    }
                                    fVar.b(-1);
                                    fVar.a();
                                    fVar.c(1);
                                    return;
                                }
                                if (i12 != -2 && ((dVar2 = fVar.f221d) == null || dVar2.f11348a != 1)) {
                                    fVar.c(4);
                                } else {
                                    fVar.b(0);
                                    fVar.c(3);
                                }
                            }
                        };
                        Handler handler = this.f219b;
                        handler.getClass();
                        this.f225h = new s1.b(bVar.f7318b, onAudioFocusChangeListener, handler, (r1.d) bVar.f7319c, bVar.f7317a);
                    }
                    AudioManager audioManager = (AudioManager) this.f218a.get();
                    s1.b bVar3 = this.f225h;
                    if (Build.VERSION.SDK_INT >= 26) {
                        Object obj3 = bVar3.f11971f;
                        obj3.getClass();
                        requestAudioFocus = audioManager.requestAudioFocus(m6.b.m(obj3));
                    } else {
                        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener2 = bVar3.f11967b;
                        r1.d dVar2 = bVar3.f11969d;
                        if ((dVar2.f11349b & 1) != 1) {
                            switch (dVar2.f11350c) {
                                case 2:
                                    break;
                                case 3:
                                    i11 = 8;
                                    break;
                                case 4:
                                    i11 = 4;
                                    break;
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                    i11 = 5;
                                    break;
                                case 6:
                                    i11 = 2;
                                    break;
                                case 11:
                                    i11 = 10;
                                    break;
                                case 12:
                                default:
                                    i11 = 3;
                                    break;
                                case 13:
                                    break;
                            }
                            requestAudioFocus = audioManager.requestAudioFocus(onAudioFocusChangeListener2, i11, bVar3.f11966a);
                        }
                        i11 = 1;
                        requestAudioFocus = audioManager.requestAudioFocus(onAudioFocusChangeListener2, i11, bVar3.f11966a);
                    }
                    if (requestAudioFocus == 1) {
                        c(2);
                        return 1;
                    }
                    c(1);
                    return -1;
                }
            } else {
                int i12 = this.f222e;
                if (i12 == 1) {
                    return -1;
                }
                if (i12 == 3) {
                    return 0;
                }
            }
            return 1;
        }
        a();
        c(0);
        return 1;
    }
}
