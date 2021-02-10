package com.kodilla.mockito.homework;

import com.kodilla.mockito.Client;
import com.kodilla.mockito.Notification;
import com.kodilla.mockito.NotificationService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class WeatherAlertsAppTestSuite {
    NotificationService notificationService = Mockito.mock(NotificationService.class);
    WeatherAlertsApp weatherAlertsApp = new WeatherAlertsApp(notificationService);
    Client client = Mockito.mock(Client.class);
    Notification notification = Mockito.mock(Notification.class);
    Localization localization = Mockito.mock(Localization.class);
    @Test
    public void subscribedClientShouldReceiveNotificationForGivenLocalization() {


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