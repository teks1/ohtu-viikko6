package statistics;

import statistics.matcher.And;
import statistics.matcher.HasAtLeast;
import statistics.matcher.HasFewerThan;
import statistics.matcher.Matcher;
import statistics.matcher.Not;
import statistics.matcher.Or;
import statistics.matcher.PlaysIn;

public class QueryBuilder {

    Matcher matcher;

    public QueryBuilder() {
        this.init();
    }

    private void init() {
        this.matcher = new Matcher() {

            @Override
            public boolean matches(Player p) {
                return true;
            }
        };
    }

    public Matcher build() {
        Matcher m = this.matcher;
        this.init();
        return m;
    }

    QueryBuilder playsIn(String team) {
        this.matcher = new And(new PlaysIn(team), matcher);
        return this;
    }

    QueryBuilder hasAtLeast(int value, String category) {
        this.matcher = new And(new HasAtLeast(value, category), matcher);
        return this;
    }

    QueryBuilder hasFewerThan(int value, String category) {
        this.matcher = new And(new HasFewerThan(value, category), matcher);
        return this;
    }

    QueryBuilder not(Matcher matcher) {
        this.matcher = new Not(matcher);
        return this;
    }

    QueryBuilder oneOf(Matcher... matchers) {
        this.matcher = new Or(matchers);
        return this;
    }

}
