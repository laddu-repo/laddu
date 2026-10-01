package n7;

import android.graphics.Bitmap;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import com.unity3d.services.UnityAdsConstants;
import j2.y;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class h {
    public static final Matrix B = new Matrix();
    public a A;

    /* renamed from: a, reason: collision with root package name */
    public Canvas f9100a;

    /* renamed from: b, reason: collision with root package name */
    public y f9101b;

    /* renamed from: c, reason: collision with root package name */
    public int f9102c;

    /* renamed from: d, reason: collision with root package name */
    public RectF f9103d;

    /* renamed from: e, reason: collision with root package name */
    public RectF f9104e;

    /* renamed from: f, reason: collision with root package name */
    public Rect f9105f;

    /* renamed from: g, reason: collision with root package name */
    public RectF f9106g;

    /* renamed from: h, reason: collision with root package name */
    public RectF f9107h;

    /* renamed from: i, reason: collision with root package name */
    public Rect f9108i;
    public RectF j;

    /* renamed from: k, reason: collision with root package name */
    public c7.a f9109k;

    /* renamed from: l, reason: collision with root package name */
    public Bitmap f9110l;

    /* renamed from: m, reason: collision with root package name */
    public Canvas f9111m;

    /* renamed from: n, reason: collision with root package name */
    public Rect f9112n;

    /* renamed from: o, reason: collision with root package name */
    public c7.a f9113o;

    /* renamed from: p, reason: collision with root package name */
    public Matrix f9114p;

    /* renamed from: q, reason: collision with root package name */
    public float[] f9115q;

    /* renamed from: r, reason: collision with root package name */
    public Bitmap f9116r;
    public Bitmap s;

    /* renamed from: t, reason: collision with root package name */
    public Canvas f9117t;

    /* renamed from: u, reason: collision with root package name */
    public Canvas f9118u;

    /* renamed from: v, reason: collision with root package name */
    public c7.a f9119v;

    /* renamed from: w, reason: collision with root package name */
    public BlurMaskFilter f9120w;

    /* renamed from: x, reason: collision with root package name */
    public float f9121x = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;

    /* renamed from: y, reason: collision with root package name */
    public RenderNode f9122y;

    /* renamed from: z, reason: collision with root package name */
    public RenderNode f9123z;

    public static Bitmap a(RectF rectF, Bitmap.Config config) {
        return Bitmap.createBitmap(Math.max((int) Math.ceil(rectF.width() * 1.05d), 1), Math.max((int) Math.ceil(rectF.height() * 1.05d), 1), config);
    }

    public static boolean d(Bitmap bitmap, RectF rectF) {
        if (bitmap != null && rectF.width() < bitmap.getWidth() && rectF.height() < bitmap.getHeight() && rectF.width() >= bitmap.getWidth() * 0.75f && rectF.height() >= bitmap.getHeight() * 0.75f) {
            return false;
        }
        return true;
    }

    public final RectF b(RectF rectF, a aVar) {
        if (this.f9104e == null) {
            this.f9104e = new RectF();
        }
        if (this.f9106g == null) {
            this.f9106g = new RectF();
        }
        this.f9104e.set(rectF);
        this.f9104e.offsetTo(rectF.left + aVar.f9085b, rectF.top + aVar.f9086c);
        RectF rectF2 = this.f9104e;
        float f3 = aVar.f9084a;
        rectF2.inset(-f3, -f3);
        this.f9106g.set(rectF);
        this.f9104e.union(this.f9106g);
        return this.f9104e;
    }

    public final void c() {
        float f3;
        c7.a aVar;
        float f10;
        RenderEffect createColorFilterEffect;
        RecordingCanvas beginRecording;
        if (this.f9100a != null && this.f9101b != null && this.f9115q != null && this.f9103d != null) {
            int c10 = y.e.c(this.f9102c);
            if (c10 != 0) {
                if (c10 != 1) {
                    float f11 = 1.0f;
                    if (c10 != 2) {
                        if (c10 == 3) {
                            if (this.f9122y != null) {
                                int i6 = Build.VERSION.SDK_INT;
                                if (i6 >= 29) {
                                    this.f9100a.save();
                                    Canvas canvas = this.f9100a;
                                    float[] fArr = this.f9115q;
                                    canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                                    this.f9122y.endRecording();
                                    if (this.f9101b.o()) {
                                        Canvas canvas2 = this.f9100a;
                                        a aVar2 = (a) this.f9101b.f7145z;
                                        if (this.f9122y != null && this.f9123z != null) {
                                            if (i6 >= 31) {
                                                float[] fArr2 = this.f9115q;
                                                if (fArr2 != null) {
                                                    f10 = fArr2[0];
                                                } else {
                                                    f10 = 1.0f;
                                                }
                                                if (fArr2 != null) {
                                                    f11 = fArr2[4];
                                                }
                                                a aVar3 = this.A;
                                                if (aVar3 == null || aVar2.f9084a != aVar3.f9084a || aVar2.f9085b != aVar3.f9085b || aVar2.f9086c != aVar3.f9086c || aVar2.f9087d != aVar3.f9087d) {
                                                    createColorFilterEffect = RenderEffect.createColorFilterEffect(new PorterDuffColorFilter(aVar2.f9087d, PorterDuff.Mode.SRC_IN));
                                                    float f12 = aVar2.f9084a;
                                                    if (f12 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                                        float f13 = ((f10 + f11) * f12) / 2.0f;
                                                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                                                        createColorFilterEffect = RenderEffect.createBlurEffect(f13, f13, createColorFilterEffect, Shader.TileMode.CLAMP);
                                                    }
                                                    this.f9123z.setRenderEffect(createColorFilterEffect);
                                                    this.A = aVar2;
                                                }
                                                RectF b10 = b(this.f9103d, aVar2);
                                                RectF rectF = new RectF(b10.left * f10, b10.top * f11, b10.right * f10, b10.bottom * f11);
                                                this.f9123z.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
                                                beginRecording = this.f9123z.beginRecording((int) rectF.width(), (int) rectF.height());
                                                beginRecording.translate((aVar2.f9085b * f10) + (-rectF.left), (aVar2.f9086c * f11) + (-rectF.top));
                                                beginRecording.drawRenderNode(this.f9122y);
                                                this.f9123z.endRecording();
                                                canvas2.save();
                                                canvas2.translate(rectF.left, rectF.top);
                                                canvas2.drawRenderNode(this.f9123z);
                                                canvas2.restore();
                                            } else {
                                                throw new RuntimeException("RenderEffect is not supported on API level <31");
                                            }
                                        } else {
                                            throw new IllegalStateException("Cannot render to render node outside a start()/finish() block");
                                        }
                                    }
                                    this.f9100a.drawRenderNode(this.f9122y);
                                    this.f9100a.restore();
                                } else {
                                    throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                                }
                            } else {
                                throw new IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                            }
                        }
                    } else if (this.f9110l != null) {
                        if (this.f9101b.o()) {
                            Canvas canvas3 = this.f9100a;
                            a aVar4 = (a) this.f9101b.f7145z;
                            RectF rectF2 = this.f9103d;
                            if (rectF2 != null && this.f9110l != null) {
                                RectF b11 = b(rectF2, aVar4);
                                if (this.f9105f == null) {
                                    this.f9105f = new Rect();
                                }
                                this.f9105f.set((int) Math.floor(b11.left), (int) Math.floor(b11.top), (int) Math.ceil(b11.right), (int) Math.ceil(b11.bottom));
                                float[] fArr3 = this.f9115q;
                                if (fArr3 != null) {
                                    f3 = fArr3[0];
                                } else {
                                    f3 = 1.0f;
                                }
                                if (fArr3 != null) {
                                    f11 = fArr3[4];
                                }
                                if (this.f9107h == null) {
                                    this.f9107h = new RectF();
                                }
                                this.f9107h.set(b11.left * f3, b11.top * f11, b11.right * f3, b11.bottom * f11);
                                if (this.f9108i == null) {
                                    this.f9108i = new Rect();
                                }
                                this.f9108i.set(0, 0, Math.round(this.f9107h.width()), Math.round(this.f9107h.height()));
                                if (d(this.f9116r, this.f9107h)) {
                                    Bitmap bitmap = this.f9116r;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                    }
                                    Bitmap bitmap2 = this.s;
                                    if (bitmap2 != null) {
                                        bitmap2.recycle();
                                    }
                                    this.f9116r = a(this.f9107h, Bitmap.Config.ARGB_8888);
                                    this.s = a(this.f9107h, Bitmap.Config.ALPHA_8);
                                    this.f9117t = new Canvas(this.f9116r);
                                    this.f9118u = new Canvas(this.s);
                                } else {
                                    Canvas canvas4 = this.f9117t;
                                    if (canvas4 != null && this.f9118u != null && (aVar = this.f9113o) != null) {
                                        canvas4.drawRect(this.f9108i, aVar);
                                        this.f9118u.drawRect(this.f9108i, this.f9113o);
                                    } else {
                                        throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                                    }
                                }
                                if (this.s != null) {
                                    if (this.f9119v == null) {
                                        this.f9119v = new c7.a(1, 0);
                                    }
                                    RectF rectF3 = this.f9103d;
                                    this.f9118u.drawBitmap(this.f9110l, Math.round((rectF3.left - b11.left) * f3), Math.round((rectF3.top - b11.top) * f11), (Paint) null);
                                    if (this.f9120w == null || this.f9121x != aVar4.f9084a) {
                                        float f14 = ((f3 + f11) * aVar4.f9084a) / 2.0f;
                                        if (f14 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                            this.f9120w = new BlurMaskFilter(f14, BlurMaskFilter.Blur.NORMAL);
                                        } else {
                                            this.f9120w = null;
                                        }
                                        this.f9121x = aVar4.f9084a;
                                    }
                                    this.f9119v.setColor(aVar4.f9087d);
                                    if (aVar4.f9084a > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                        this.f9119v.setMaskFilter(this.f9120w);
                                    } else {
                                        this.f9119v.setMaskFilter(null);
                                    }
                                    this.f9119v.setFilterBitmap(true);
                                    this.f9117t.drawBitmap(this.s, Math.round(aVar4.f9085b * f3), Math.round(aVar4.f9086c * f11), this.f9119v);
                                    canvas3.drawBitmap(this.f9116r, this.f9108i, this.f9105f, this.f9109k);
                                } else {
                                    throw new IllegalStateException("Expected to have allocated a shadow mask bitmap");
                                }
                            } else {
                                throw new IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
                            }
                        }
                        if (this.f9112n == null) {
                            this.f9112n = new Rect();
                        }
                        this.f9112n.set(0, 0, (int) (this.f9103d.width() * this.f9115q[0]), (int) (this.f9103d.height() * this.f9115q[4]));
                        this.f9100a.drawBitmap(this.f9110l, this.f9112n, this.f9103d, this.f9109k);
                    } else {
                        throw new IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
                    }
                } else {
                    this.f9100a.restore();
                }
            } else {
                this.f9100a.restore();
            }
            this.f9100a = null;
            return;
        }
        throw new IllegalStateException("OffscreenBitmap: finish() call without matching start()");
    }

    public final Canvas e(Canvas canvas, RectF rectF, y yVar) {
        RecordingCanvas beginRecording;
        if (this.f9100a == null) {
            if (this.f9115q == null) {
                this.f9115q = new float[9];
            }
            if (this.f9114p == null) {
                this.f9114p = new Matrix();
            }
            canvas.getMatrix(this.f9114p);
            this.f9114p.getValues(this.f9115q);
            float[] fArr = this.f9115q;
            float f3 = fArr[0];
            int i6 = 4;
            float f10 = fArr[4];
            if (this.j == null) {
                this.j = new RectF();
            }
            this.j.set(rectF.left * f3, rectF.top * f10, rectF.right * f3, rectF.bottom * f10);
            this.f9100a = canvas;
            this.f9101b = yVar;
            if (yVar.f7144y >= 255 && !yVar.o()) {
                i6 = 1;
            } else if (!yVar.o()) {
                i6 = 2;
            } else {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 29 || !canvas.isHardwareAccelerated() || i10 <= 31) {
                    i6 = 3;
                }
            }
            this.f9102c = i6;
            if (this.f9103d == null) {
                this.f9103d = new RectF();
            }
            this.f9103d.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            if (this.f9109k == null) {
                this.f9109k = new c7.a();
            }
            this.f9109k.reset();
            int c10 = y.e.c(this.f9102c);
            if (c10 != 0) {
                if (c10 != 1) {
                    Matrix matrix = B;
                    if (c10 != 2) {
                        if (c10 == 3) {
                            if (Build.VERSION.SDK_INT >= 29) {
                                if (this.f9122y == null) {
                                    this.f9122y = k4.e.c();
                                }
                                if (yVar.o() && this.f9123z == null) {
                                    this.f9123z = k4.e.z();
                                    this.A = null;
                                }
                                this.f9122y.setAlpha(yVar.f7144y / 255.0f);
                                if (yVar.o()) {
                                    RenderNode renderNode = this.f9123z;
                                    if (renderNode != null) {
                                        renderNode.setAlpha(yVar.f7144y / 255.0f);
                                    } else {
                                        throw new IllegalStateException("Must initialize shadowRenderNode when we have shadow");
                                    }
                                }
                                this.f9122y.setHasOverlappingRendering(true);
                                RenderNode renderNode2 = this.f9122y;
                                RectF rectF2 = this.j;
                                renderNode2.setPosition((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
                                beginRecording = this.f9122y.beginRecording((int) this.j.width(), (int) this.j.height());
                                beginRecording.setMatrix(matrix);
                                beginRecording.scale(f3, f10);
                                beginRecording.translate(-rectF.left, -rectF.top);
                                return beginRecording;
                            }
                            throw new IllegalStateException("RenderNode not supported but we chose it as render strategy");
                        }
                        throw new RuntimeException("Invalid render strategy for OffscreenLayer");
                    }
                    if (this.f9113o == null) {
                        c7.a aVar = new c7.a();
                        this.f9113o = aVar;
                        aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    }
                    if (d(this.f9110l, this.j)) {
                        Bitmap bitmap = this.f9110l;
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        this.f9110l = a(this.j, Bitmap.Config.ARGB_8888);
                        this.f9111m = new Canvas(this.f9110l);
                    } else {
                        Canvas canvas2 = this.f9111m;
                        if (canvas2 != null) {
                            canvas2.setMatrix(matrix);
                            this.f9111m.drawRect(-1.0f, -1.0f, this.j.width() + 1.0f, this.j.height() + 1.0f, this.f9113o);
                        } else {
                            throw new IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                        }
                    }
                    l0.d.a(0, this.f9109k);
                    this.f9109k.setColorFilter(null);
                    this.f9109k.setAlpha(yVar.f7144y);
                    Canvas canvas3 = this.f9111m;
                    canvas3.scale(f3, f10);
                    canvas3.translate(-rectF.left, -rectF.top);
                    return canvas3;
                }
                this.f9109k.setAlpha(yVar.f7144y);
                this.f9109k.setColorFilter(null);
                i.e(canvas, rectF, this.f9109k, 31);
                return canvas;
            }
            canvas.save();
            return canvas;
        }
        throw new IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
    }
}
