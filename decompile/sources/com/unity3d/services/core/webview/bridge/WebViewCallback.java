package com.unity3d.services.core.webview.bridge;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.services.core.log.DeviceLog;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class WebViewCallback implements Parcelable {
    public static final Parcelable.Creator<WebViewCallback> CREATOR = new Parcelable.Creator<WebViewCallback>() { // from class: com.unity3d.services.core.webview.bridge.WebViewCallback.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WebViewCallback createFromParcel(Parcel parcel) {
            return new WebViewCallback(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public WebViewCallback[] newArray(int i6) {
            return new WebViewCallback[i6];
        }
    };
    private String _callbackId;
    private int _invocationId;
    private boolean _invoked;

    public WebViewCallback(String str, int i6) {
        this._callbackId = str;
        this._invocationId = i6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 45678;
    }

    public void error(Enum r22, Object... objArr) {
        invoke(CallbackStatus.ERROR, r22, objArr);
    }

    public String getCallbackId() {
        return this._callbackId;
    }

    public int getInvocationId() {
        return this._invocationId;
    }

    public void invoke(Object... objArr) {
        invoke(CallbackStatus.OK, null, objArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeString(this._callbackId);
        parcel.writeByte(this._invoked ? (byte) 1 : (byte) 0);
        parcel.writeInt(this._invocationId);
    }

    private void invoke(CallbackStatus callbackStatus, Enum r42, Object... objArr) {
        String str;
        if (this._invoked || (str = this._callbackId) == null || str.length() == 0) {
            return;
        }
        this._invoked = true;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(objArr));
        arrayList.add(0, this._callbackId);
        Invocation invocationById = Invocation.getInvocationById(this._invocationId);
        if (invocationById == null) {
            DeviceLog.error("Couldn't get batch with id: " + getInvocationId());
            return;
        }
        invocationById.setInvocationResponse(callbackStatus, r42, arrayList.toArray());
    }

    public WebViewCallback(Parcel parcel) {
        this._callbackId = parcel.readString();
        this._invoked = parcel.readByte() != 0;
        this._invocationId = parcel.readInt();
    }
}
