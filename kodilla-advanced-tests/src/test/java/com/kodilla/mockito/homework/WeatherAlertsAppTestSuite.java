package com.kodilla.mockito.homework;

import com.kodilla.mockito.Client;
import com.kodilla.mockito.Notification;
import com.kodilla.mockito.NotificationService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class WeatherAlertsAppTestSuite {
    NotificationService notificationService = Mockito.mock(NotificationService.class);
    WeatherAlertsApp weatherAlertsApp = new WeatherAlertsApp(notificationService);
    Client client = Mockito.mock(Client.class);
    Client notification = Mockito.mock(Client.class);
    Set<Localization> localizations = new HashSet<>();
    Localization localization = Mockito.mock(Localization.class);
    @Test
    public void subscribedClientShouldReceiveNotificationForGivenLocalization() {
        /* weatherAlertsApp.subscribe(client, localization);
        weatherAlertsApp.notify(localizations);
        Mockito.verify(notificationService, Mockito.times(1)).sendAlert(notification); */
    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotificationForGivenLocalization() {

    }

    @Test
    public void clientShouldNotReceiveAnyNotificationsAfterUnsubscribingAllOfTheirLocalizations() {

    }

    @Test
    public void allClientsShouldReceiveGeneralNotifications() {

    }

    @Test
    public void removingLocalizationShouldBePossible() {

    }
}