package v2;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;
import u2.v;

/* JADX INFO: compiled from: r8-map-id-df6c63c9abd8cd3f2454576be9f63d7764d15ce3d0d0a3ef71355d72d759804e */
/* JADX INFO: loaded from: classes.dex */
public final class k extends GLSurfaceView {
    public static final /* synthetic */ int G = 0;
    public final i A;
    public SurfaceTexture B;
    public Surface C;
    public boolean D;
    public boolean E;
    public boolean F;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CopyOnWriteArrayList f13119v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final SensorManager f13120w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Sensor f13121x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d f13122y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Handler f13123z;

    public k(Context context) {
        super(context, null);
        this.f13119v = new CopyOnWriteArrayList();
        this.f13123z = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f13120w = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f13121x = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        i iVar = new i();
        this.A = iVar;
        j jVar = new j(this, iVar);
        View.OnTouchListener lVar = new l(context, jVar);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f13122y = new d(windowManager.getDefaultDisplay(), lVar, jVar);
        this.D = true;
        setEGLContextClientVersion(2);
        setRenderer(jVar);
        setOnTouchListener(lVar);
    }

    public final void a() {
        boolean z2 = this.D && this.E;
        Sensor sensor = this.f13121x;
        if (sensor == null || z2 == this.F) {
            return;
        }
        d dVar = this.f13122y;
        SensorManager sensorManager = this.f13120w;
        if (z2) {
            sensorManager.registerListener(dVar, sensor, 0);
        } else {
            sensorManager.unregisterListener(dVar);
        }
        this.F = z2;
    }

    public a getCameraMotionListener() {
        return this.A;
    }

    public v getVideoFrameMetadataListener() {
        return this.A;
    }

    public Surface getVideoSurface() {
        return this.C;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f13123z.post(new jd.j(12, this));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.E = false;
        a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.E = true;
        a();
    }

    public void setDefaultStereoMode(int i) {
        this.A.F = i;
    }

    public void setUseSensorRotation(boolean z2) {
        this.D = z2;
        a();
    }
}
