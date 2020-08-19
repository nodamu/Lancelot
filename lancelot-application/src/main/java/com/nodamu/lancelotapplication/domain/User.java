package com.nodamu.lancelotapplication.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Value;

import java.util.UUID;

@RequiredArgsConstructor
public class User {

    @Getter private final UserId userId;
    @Getter private final String username;
    @Getter private final String password;

    @Value
    public static class UserId {
         private UUID value ;
    }
}
