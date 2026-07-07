package com.unity3d.services.ads.gmascar.managers;

import a2.a;
import a2.c0;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.services.ads.gmascar.GMA;
import com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.ads.gmascar.utils.IScarAdFormatProvider;
import com.unity3d.services.ads.gmascar.utils.ScarRequestHandler;
import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import com.unity3d.services.core.request.metrics.ScarMetric;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public abstract class BiddingBaseManager implements IBiddingManager {
    private final boolean _isAsyncTokenCall;
    private final ScarRequestHandler _scarRequestHandler;
    protected final AtomicBoolean isUploadPermitted;
    private final IScarAdFormatProvider scarAdFormatProvider;
    private final AtomicReference<BiddingSignals> signals;
    private final String tokenIdentifier;
    private final IUnityAdsTokenListener unityAdsTokenListener;

    /* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
    /* renamed from: com.unity3d.services.ads.gmascar.managers.BiddingBaseManager$1 */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements IBiddingSignalsListener {
        public AnonymousClass1() {
        }

        @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
        public void onSignalsFailure(String str) {
            BiddingBaseManager.this.sendFetchResult(str);
        }

        @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
        public void onSignalsReady(BiddingSignals biddingSignals) {
            BiddingBaseManager.this.onSignalsReady(biddingSignals);
            BiddingBaseManager.this.sendFetchResult(HttpUrl.FRAGMENT_ENCODE_SET);
        }
    }

    public BiddingBaseManager(IUnityAdsTokenListener iUnityAdsTokenListener) {
        this(null, iUnityAdsTokenListener, new ScarRequestHandler());
    }

    public static /* synthetic */ void a(BiddingBaseManager biddingBaseManager, BiddingSignals biddingSignals) {
        biddingBaseManager.lambda$uploadSignals$2(biddingSignals);
    }

    private synchronized void attemptUpload() {
        if (this.signals.get() != null && this.isUploadPermitted.compareAndSet(true, false)) {
            uploadSignals();
        }
    }

    public static /* synthetic */ void b(BiddingBaseManager biddingBaseManager, String str) {
        biddingBaseManager.lambda$onUnityAdsTokenReady$0(str);
    }

    public static /* synthetic */ void c(BiddingBaseManager biddingBaseManager) {
        biddingBaseManager.lambda$fetchSignals$1();
    }

    public /* synthetic */ void lambda$fetchSignals$1() {
        GMA.getInstance().getSCARBiddingSignals(this.scarAdFormatProvider.buildAdFormatList(), new IBiddingSignalsListener() { // from class: com.unity3d.services.ads.gmascar.managers.BiddingBaseManager.1
            public AnonymousClass1() {
            }

            @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
            public void onSignalsFailure(String str) {
                BiddingBaseManager.this.sendFetchResult(str);
            }

            @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
            public void onSignalsReady(BiddingSignals biddingSignals) {
                BiddingBaseManager.this.onSignalsReady(biddingSignals);
                BiddingBaseManager.this.sendFetchResult(HttpUrl.FRAGMENT_ENCODE_SET);
            }
        });
    }

    public /* synthetic */ void lambda$onUnityAdsTokenReady$0(String str) {
        this.unityAdsTokenListener.onUnityAdsTokenReady(str);
    }

    public /* synthetic */ void lambda$uploadSignals$2(BiddingSignals biddingSignals) {
        try {
            this._scarRequestHandler.makeUploadRequest(this.tokenIdentifier, biddingSignals, new ConfigurationReader().getCurrentConfiguration().getScarBiddingUrl());
            getMetricSender().sendMetric(ScarMetric.hbSignalsUploadSuccess(this._isAsyncTokenCall));
        } catch (Exception e10) {
            getMetricSender().sendMetric(ScarMetric.hbSignalsUploadFailure(this._isAsyncTokenCall, e10.getLocalizedMessage()));
        }
    }

    public void fetchSignals() {
        getMetricSender().sendMetric(ScarMetric.hbSignalsFetchStart(this._isAsyncTokenCall));
        new Thread(new a(this, 12)).start();
    }

    @Override // com.unity3d.services.ads.gmascar.managers.IBiddingManager
    public String getFormattedToken(String str) {
        if (str != null && !str.isEmpty()) {
            String tokenIdentifier = getTokenIdentifier();
            if (tokenIdentifier != null && !tokenIdentifier.isEmpty()) {
                return tokenIdentifier + ":" + str;
            }
            return str;
        }
        return null;
    }

    public SDKMetricsSender getMetricSender() {
        return (SDKMetricsSender) Utilities.getService(SDKMetricsSender.class);
    }

    @Override // com.unity3d.services.ads.gmascar.managers.IBiddingManager
    public String getTokenIdentifier() {
        return this.tokenIdentifier;
    }

    public void onSignalsReady(BiddingSignals biddingSignals) {
        this.signals.set(biddingSignals);
        attemptUpload();
    }

    @Override // com.unity3d.ads.IUnityAdsTokenListener
    public final void onUnityAdsTokenReady(String str) {
        if (this.unityAdsTokenListener != null) {
            Utilities.wrapCustomerListener(new c0(10, this, str));
        }
    }

    public void permitSignalsUpload() {
        this.isUploadPermitted.set(true);
        attemptUpload();
    }

    public void permitUpload() {
        this.isUploadPermitted.set(true);
    }

    public void sendFetchResult(String str) {
        if (str != HttpUrl.FRAGMENT_ENCODE_SET) {
            getMetricSender().sendMetric(ScarMetric.hbSignalsFetchFailure(this._isAsyncTokenCall, str));
        } else {
            getMetricSender().sendMetric(ScarMetric.hbSignalsFetchSuccess(this._isAsyncTokenCall));
        }
    }

    public abstract void start();

    public void uploadSignals() {
        getMetricSender().sendMetric(ScarMetric.hbSignalsUploadStart(this._isAsyncTokenCall));
        BiddingSignals biddingSignals = this.signals.get();
        if (biddingSignals != null && !biddingSignals.isEmpty()) {
            new Thread(new c0(9, this, biddingSignals)).start();
        } else {
            getMetricSender().sendMetric(ScarMetric.hbSignalsUploadFailure(this._isAsyncTokenCall, "null or empty signals"));
        }
    }

    public BiddingBaseManager(IScarAdFormatProvider iScarAdFormatProvider, IUnityAdsTokenListener iUnityAdsTokenListener) {
        this(iScarAdFormatProvider, iUnityAdsTokenListener, new ScarRequestHandler());
    }

    public BiddingBaseManager(IScarAdFormatProvider iScarAdFormatProvider, IUnityAdsTokenListener iUnityAdsTokenListener, ScarRequestHandler scarRequestHandler) {
        this.isUploadPermitted = new AtomicBoolean(false);
        this.signals = new AtomicReference<>();
        this.tokenIdentifier = UUID.randomUUID().toString();
        this.unityAdsTokenListener = iUnityAdsTokenListener;
        this._isAsyncTokenCall = iUnityAdsTokenListener != null;
        this._scarRequestHandler = scarRequestHandler;
        this.scarAdFormatProvider = iScarAdFormatProvider;
    }
}
