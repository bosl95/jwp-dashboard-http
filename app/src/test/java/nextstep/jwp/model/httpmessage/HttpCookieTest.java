package nextstep.jwp.model.httpmessage;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HttpCookieTest {

    @Test
    void getCookie() {
        HttpCookie httpCookie = new HttpCookie("yummy_cookie=choco; tasty_cookie=strawberry; JSESSIONID=656cef62-e3c4-40bc-a8df-94732920ed46");

        assertThat(httpCookie.getCookie("yummy_cookie")).isEqualTo("choco");
        assertThat(httpCookie.getCookie("tasty_cookie")).isEqualTo("strawberry");
        assertThat(httpCookie.getCookie("JSESSIONID")).isEqualTo("656cef62-e3c4-40bc-a8df-94732920ed46");
    }
}