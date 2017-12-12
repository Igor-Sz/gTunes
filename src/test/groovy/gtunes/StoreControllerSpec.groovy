package gtunes

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class StoreControllerSpec extends Specification implements ControllerUnitTest<StoreController> {

    def setup() {
    }

    def cleanup() {
    }

    void 'test Something'() {
        controller.index();
		assert 'Witaj w sklepie gTunes' == response.text
    }
}
