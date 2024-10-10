library IEEE;
use IEEE.STD_LOGIC_1164.all;

entity DrinksFSM is
    port(reset    : in  std_logic;
          clk        : in  std_logic;
          V       : in  std_logic;
          C        : in  std_logic;
          Drink    : out std_logic);
end DrinksFSM;

architecture Behavioral of DrinksFSM is

    type TState is (Idle, E1, E2, E3, E4, E5);
    signal s_currentState, s_nextState : TState;

begin
    sync_proc : process(clk)
    begin
        if (rising_edge(clk)) then
            if (reset = '1') then
                s_currentState <= Idle;
            else
                s_currentState <= s_nextState;
            end if;
        end if;
    end process;

    comb_proc : process(s_currentState, V, C)
    begin
        case (s_currentState) is
        when Idle =>
            Drink <= '0';
            if (V = '1') then
                s_nextState <= E1;
            elsif (C = '1') then
               s_nextState <= E3;
else
                s_nextState <= Idle;
            end if;

        when E1 =>
            Drink <= '0';
            if (V = '1') then
                s_nextState <= E2;
            elsif (C = '1') then
                s_nextState <= E4;
            else
                s_nextState <= E1;
            end if;

        when E2 =>
            Drink <= '0';
            if (V = '1') then
                s_nextState <= E3;
            elsif (C = '1') then
                s_nextState <= E5;
            else
                s_nextState <= E2;
            end if;

        when E3 =>
            Drink <= '0';
            if (V = '1') then
                s_nextState <= E4;
            elsif (C = '1') then
                s_nextState <= E5;
            else
                s_nextState <= E3;
            end if;

        when E4 =>
            Drink <= '0';
            if ((V = '1') or (C = '1')) then
                s_nextState <= E5;
            else
                s_nextState <= E4;
            end if;

        when E5 =>
            Drink <= '1';
            s_nextState <= Idle;
        end case;

    end process;

end Behavioral;
			
			
			
			
			
			
			
			
			