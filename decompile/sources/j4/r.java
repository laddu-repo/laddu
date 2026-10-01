package j4;

import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.ParcelImpl;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public final class r extends MediaSession.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f7200a;

    public r(s sVar) {
        this.f7200a = sVar;
    }

    public static void b(u uVar) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 28) {
            return;
        }
        MediaSession mediaSession = uVar.f7208a;
        String str = null;
        if (i6 >= 24) {
            try {
                str = (String) mediaSession.getClass().getMethod("getCallingPackage", null).invoke(mediaSession, null);
            } catch (Exception e10) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e10);
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = "android.media.session.MediaController";
        }
        uVar.d(new d0(str, -1, -1));
    }

    public final u a() {
        u uVar;
        synchronized (this.f7200a.f7201a) {
            uVar = (u) this.f7200a.f7204d.get();
        }
        if (uVar != null && this.f7200a == uVar.b()) {
            return uVar;
        }
        return null;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
        y yVar;
        IBinder asBinder;
        q5.c cVar;
        u a10 = a();
        if (a10 == null) {
            return;
        }
        b0.l(bundle);
        b(a10);
        try {
            if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                if (resultReceiver != null) {
                    Bundle bundle2 = new Bundle();
                    a0 a0Var = a10.f7210c;
                    h a11 = a0Var.a();
                    if (a11 == null) {
                        asBinder = null;
                    } else {
                        asBinder = a11.asBinder();
                    }
                    bundle2.putBinder("android.support.v4.media.session.EXTRA_BINDER", asBinder);
                    synchronized (a0Var.f7155x) {
                        cVar = a0Var.A;
                    }
                    if (cVar != null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putParcelable("a", new ParcelImpl(cVar));
                        bundle2.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle3);
                    }
                    resultReceiver.send(0, bundle2);
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                if (bundle != null) {
                    this.f7200a.b((o) e9.f.a(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), o.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                if (bundle != null) {
                    this.f7200a.c((o) e9.f.a(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), o.CREATOR), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                if (bundle != null) {
                    this.f7200a.q((o) e9.f.a(bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), o.CREATOR));
                }
            } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                List list = a10.f7215h;
                if (list != null && bundle != null) {
                    int i6 = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                    if (i6 >= 0 && i6 < list.size()) {
                        yVar = (y) list.get(i6);
                    } else {
                        yVar = null;
                    }
                    if (yVar != null) {
                        this.f7200a.q(yVar.f7221x);
                    }
                }
            } else {
                this.f7200a.d(str, bundle, resultReceiver);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
        }
        a10.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onCustomAction(String str, Bundle bundle) {
        u a10 = a();
        if (a10 == null) {
            return;
        }
        b0.l(bundle);
        b(a10);
        try {
            boolean equals = str.equals("android.support.v4.media.session.action.PLAY_FROM_URI");
            s sVar = this.f7200a;
            if (equals) {
                if (bundle != null) {
                    Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                    Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    b0.l(bundle2);
                    sVar.l(uri, bundle2);
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                sVar.m();
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                if (bundle != null) {
                    String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    b0.l(bundle3);
                    sVar.n(string, bundle3);
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                if (bundle != null) {
                    String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    b0.l(bundle4);
                    sVar.o(string2, bundle4);
                }
            } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                if (bundle != null) {
                    Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                    Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                    b0.l(bundle5);
                    sVar.p(uri2, bundle5);
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                if (bundle != null) {
                    bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                if (bundle != null) {
                    sVar.w(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                if (bundle != null) {
                    sVar.x(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                if (bundle != null) {
                    l0 l0Var = (l0) e9.f.a(bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING"), l0.CREATOR);
                    b0.l(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                    sVar.v(l0Var);
                }
            } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                if (bundle != null) {
                    sVar.t(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                }
            } else {
                sVar.e(str, bundle);
            }
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
        }
        a10.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onFastForward() {
        u a10 = a();
        if (a10 == null) {
            return;
        }
        b(a10);
        this.f7200a.f();
        a10.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final boolean onMediaButtonEvent(Intent intent) {
        u a10 = a();
        if (a10 != null) {
            b(a10);
            boolean g10 = this.f7200a.g(intent);
            a10.d(null);
            if (!g10 && !super.onMediaButtonEvent(intent)) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPause() {
        u a10 = a();
        if (a10 == null) {
            return;
        }
        b(a10);
        this.f7200a.h();
        a10.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlay() {
        u a10 = a();
        if (a10 == null) {
            return;
        }
        b(a10);
        this.f7200a.i();
        a10.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromMediaId(String str, Bundle bundle) {
        u a10 = a();
        if (a10 == null) {
            return;
        }
        b0.l(bundle);
        b(a10);
        this.f7200a.j(str, bundle);
        a10.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromSearch(String str, Bundle bundle) {
        u a10 = a();
        if (a10 == null) {
            return;
        }
        b0.l(bundle);
        b(a10);
        this.f7200a.k(str, bundle);
        a10.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPlayFromUri(Uri uri, Bundle bundle) {
        u a10 = a();
        if (a10 == null) {
            return;
        }
        b0.l(bundle);
        b(a10);
        this.f7200a.l(uri, bundle);
        a10.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepare() {
        u a10 = a();
        if (a10 == null) {
            return;
        }
        b(a10);
        this.f7200a.m();
        a10.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromMediaId(String str, Bundle bundle) {
        u a10 = a();
        if (a10 == null) {
            return;
        }
        b0.l(bundle);
        b(a10);
        this.f7200a.n(str, bundle);
        a10.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromSearch(String str, Bundle bundle) {
        u a10 = a();
        if (a10 == null) {
            return;
        }
        b0.l(bundle);
        b(a10);
        this.f7200a.o(str, bundle);
        a10.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onPrepareFromUri(Uri uri, Bundle bundle) {
        u a10 = a();
        if (a10 == null) {
            return;
        }
        b0.l(bundle);
        b(a10);
        this.f7200a.p(uri, bundle);
        a10.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onRewind() {
        u a10 = a();
        if (a10 == null) {
            return;
        }
        b(a10);
        this.f7200a.r();
        a10.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSeekTo(long j) {
        u a10 = a();
        if (a10 == null) {
            return;
        }
        b(a10);
        this.f7200a.s(j);
        a10.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetPlaybackSpeed(float f3) {
        u a10 = a();
        if (a10 == null) {
            return;
        }
        b(a10);
        this.f7200a.t(f3);
        a10.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSetRating(Rating rating) {
        l0 l0Var;
        l0 l0Var2;
        u a10 = a();
        if (a10 == null) {
            return;
        }
        b(a10);
        if (rating != null) {
            int ratingStyle = rating.getRatingStyle();
            if (rating.isRated()) {
                float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                switch (ratingStyle) {
                    case 1:
                        if (rating.hasHeart()) {
                            f3 = 1.0f;
                        }
                        l0Var2 = new l0(1, f3);
                        l0Var = l0Var2;
                        break;
                    case 2:
                        if (rating.isThumbUp()) {
                            f3 = 1.0f;
                        }
                        l0Var2 = new l0(2, f3);
                        l0Var = l0Var2;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        l0Var = l0.d(ratingStyle, rating.getStarRating());
                        break;
                    case 6:
                        l0Var = l0.c(rating.getPercentRating());
                        break;
                }
                this.f7200a.u(l0Var);
                a10.d(null);
            }
            switch (ratingStyle) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    l0Var = new l0(ratingStyle, -1.0f);
                    break;
                default:
                    l0Var = null;
                    break;
            }
            l0Var.getClass();
            l0Var.f7193z = rating;
            this.f7200a.u(l0Var);
            a10.d(null);
        }
        l0Var = null;
        this.f7200a.u(l0Var);
        a10.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToNext() {
        u a10 = a();
        if (a10 == null) {
            return;
        }
        b(a10);
        this.f7200a.y();
        a10.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToPrevious() {
        u a10 = a();
        if (a10 == null) {
            return;
        }
        b(a10);
        this.f7200a.z();
        a10.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onSkipToQueueItem(long j) {
        u a10 = a();
        if (a10 == null) {
            return;
        }
        b(a10);
        this.f7200a.A(j);
        a10.d(null);
    }

    @Override // android.media.session.MediaSession.Callback
    public final void onStop() {
        u a10 = a();
        if (a10 == null) {
            return;
        }
        b(a10);
        this.f7200a.B();
        a10.d(null);
    }
}
