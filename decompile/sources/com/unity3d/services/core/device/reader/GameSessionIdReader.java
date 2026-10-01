package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.properties.ClientProperties;
import java.util.UUID;
import okhttp3.HttpUrl;

/* compiled from: r8-map-id-7bd85f1e2f7c008961cee9e44e2adc91279c207f1e1906d6942eb2d5ada0c5e8 */
/* loaded from: classes.dex */
public class GameSessionIdReader implements IGameSessionIdReader {
    private static final int GAME_SESSION_ID_LENGTH = 12;
    private static volatile GameSessionIdReader _instance;
    private Long gameSessionId;

    private GameSessionIdReader() {
    }

    private void generate() {
        UUID randomUUID = UUID.randomUUID();
        this.gameSessionId = Long.valueOf((Long.toString(randomUUID.getMostSignificantBits()) + Long.toString(randomUUID.getLeastSignificantBits())).replace("-", HttpUrl.FRAGMENT_ENCODE_SET).substring(0, 12));
    }

    public static GameSessionIdReader getInstance() {
        if (_instance == null) {
            synchronized (GameSessionIdReader.class) {
                try {
                    if (_instance == null) {
                        _instance = new GameSessionIdReader();
                    }
                } finally {
                }
            }
        }
        return _instance;
    }

    private void store() {
        Storage storage;
        if (StorageManager.init(ClientProperties.getApplicationContext()) && (storage = StorageManager.getStorage(StorageManager.StorageType.PRIVATE)) != null) {
            storage.set(JsonStorageKeyNames.GAME_SESSION_ID_NORMALIZED_KEY, this.gameSessionId);
            storage.writeStorage();
        }
    }

    @Override // com.unity3d.services.core.device.reader.IGameSessionIdReader
    public synchronized Long getGameSessionId() {
        try {
            if (this.gameSessionId == null) {
                generate();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.gameSessionId;
    }

    @Override // com.unity3d.services.core.device.reader.IGameSessionIdReader
    public synchronized Long getGameSessionIdAndStore() {
        try {
            if (this.gameSessionId == null) {
                generate();
                store();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.gameSessionId;
    }
}
