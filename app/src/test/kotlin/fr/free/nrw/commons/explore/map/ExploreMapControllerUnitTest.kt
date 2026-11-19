package fr.free.nrw.commons.explore.map

import org.junit.Assert.assertNull
import org.junit.Test

class ExploreMapControllerUnitTest {
    @Test
    fun loadAttractionsFromLocationReturnsNullWhenSearchIsNull() {
        val exploreMapController = ExploreMapController(ExploreMapCalls())

        assertNull(exploreMapController.loadAttractionsFromLocation(null, null, false))
    }
}
