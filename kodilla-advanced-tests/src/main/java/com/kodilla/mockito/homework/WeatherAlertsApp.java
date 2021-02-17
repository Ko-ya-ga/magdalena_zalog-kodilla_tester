package com.kodilla.mockito.homework;

import com.kodilla.mockito.Client;
import com.kodilla.mockito.Notification;
import com.kodilla.mockito.NotificationService;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WeatherAlertsApp {
    private NotificationService notificationService;
    private Map<Client, Set<Localization>> clientNotifications = new HashMap<>();

    public WeatherAlertsApp(NotificationService notificationService) {

        this.notificationService = notificationService;
    }

    public void notify(Set<Localization> localizations) {
        if (localizations.size() == 0) {
            clientNotifications.entrySet()
                    .forEach(e -> notificationService.sendAlert(e.getKey()));
        } else {
            for (Localization localization : localizations) {
                clientNotifications.entrySet().stream()
                        .filter(e -> e.getValue().contains(localization))
                        .forEach(e -> notificationService.sendAlert(e.getKey()));
            }
        }
    }
    public void subscribe(Client client, Localization localization) {
        clientNotifications.get(client).add(localization);
    }

    public void unsubscribe(Client client, Localization localization) {
        clientNotifications.get(client).remove(localization);
    }
}
