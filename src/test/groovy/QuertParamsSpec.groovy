import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import com.sachakilinski.poc.springbootgroovyspock.business.QueryParametersCounter
import spock.lang.Specification
import com.sachakilinski.poc.springbootgroovyspock.Main

/**
 * Created by sachakilinski on 11/4/16.
 */
@ContextConfiguration(classes=Main.class)
class QuertParamsSpec extends Specification {

    @Autowired
    private QueryParametersCounter queryParametersCounter

    def "query parameters number"(){

        expect:
            queryParametersCounter.count(params) == count

        where:
            params  ||  count
            [:]     ||  0
            [a:1]   ||  1
            [a:1, b:2] || 2
    }
}
