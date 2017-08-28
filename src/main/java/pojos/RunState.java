package pojos;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class RunState
{
    String runstate;

    public String getRunstate()
    {
        return runstate;
    }

    public void setRunstate(String runstate)
    {
        this.runstate = runstate;
    }

    @Override
    public String toString()
    {
        String response = null;
        ObjectMapper mapper = new ObjectMapper();

        try
        {
         response = mapper.writeValueAsString(this);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return response;
    }
}
