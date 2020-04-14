package com.pps.betterserver;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

/**
 * AppVerticle!
 *
 */
public class AppVerticle extends AbstractVerticle {

    @Override
    public void start(Future<Void> fut) {
        vertx
            .createHttpServer()
            .requestHandler( r -> {
                r.response().end("<h1>Hello from my first Vert.x 3 application</h1>");
            })
            .listen(8089, result -> {
                if (result.succeeded()) {
                    fut.complete();
                } else {
                    fut.fail(fut.cause());
                }
            });
    }
}