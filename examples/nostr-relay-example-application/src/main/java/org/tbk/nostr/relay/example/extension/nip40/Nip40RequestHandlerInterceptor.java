package org.tbk.nostr.relay.example.extension.nip40;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.socket.WebSocketSession;
import org.tbk.nostr.base.EventId;
import org.tbk.nostr.nips.Nip40;
import org.tbk.nostr.proto.Event;
import org.tbk.nostr.proto.EventRequest;
import org.tbk.nostr.proto.Request;
import org.tbk.nostr.relay.example.nostr.interceptor.NostrRequestHandlerInterceptor;

@Slf4j
@RequiredArgsConstructor
public class Nip40RequestHandlerInterceptor implements NostrRequestHandlerInterceptor {

    @NonNull
    private final Nip40Support nip40Support;

    @Override
    public void postHandle(WebSocketSession session, Request request) {
        if (request.getKindCase() == Request.KindCase.EVENT) {
            handleEvent(request.getEvent().getEvent());
        }
    }

    private void handleEvent(Event event) {
        Nip40.getExpiration(event).ifPresent(expiresAt -> {
            nip40Support.markExpiresAt(EventId.of(event.getId().toByteArray()), expiresAt);
        });
    }   
}
