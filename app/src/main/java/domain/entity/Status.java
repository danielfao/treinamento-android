package domain.entity;

/**
 * Entidade da API GitHub Status.
 *
 * @see <a href="https://status.github.com/api/last-message.json">Last Message</a>
 *
 * Created by danifao on 2017-01-09.
 */

public class Status {
    public String status;
    public String body;
    public String created_on;

}
