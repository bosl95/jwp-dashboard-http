package nextstep.jwp.model.httpmessage.session;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HttpCookieTest {

    @Test
    void getCookie() {
        HttpCookie httpCookie = new HttpCookie("yummy_cookie=choco; tasty_cookie=strawberry; JSESSIONID=656cef62-e3c4-40bc-a8df-94732920ed46");

        assertThat(httpCookie.getCookieValue("yummy_cookie")).isEqualTo("choco");
        assertThat(httpCookie.getCookieValue("tasty_cookie")).isEqualTo("strawberry");
        assertThat(httpCookie.getCookieValue("JSESSIONID")).isEqualTo("656cef62-e3c4-40bc-a8df-94732920ed46");
    }

    @Test
    void testToString() {
        HttpCookie httpCookie = new HttpCookie("yummy_cookie=choco; JSESSIONID=656cef62-e3c4-40bc-a8df-94732920ed46");
        assertThat(httpCookie.value()).hasToString("yummy_cookie=choco; JSESSIONID=656cef62-e3c4-40bc-a8df-94732920ed46");
    }

    @Test
    void contains() {
        HttpCookie httpCookie = new HttpCookie("yummy_cookie=choco; JSESSIONID=656cef62-e3c4-40bc-a8df-94732920ed46");
        assertThat(httpCookie.contains("yummy_cookie")).isTrue();
        assertThat(httpCookie.contains("JSESSIONID")).isTrue();
    }
}