library IEEE;
use IEEE.STD_LOGIC_1164.all;
use IEEE.NUMERIC_STD.all;

entity TimerN is
	generic(N: positive);
	port(clk      : in  std_logic;
		  DecIn	  : in std_logic_vector(3 downto 0);
		  start    : in  std_logic;
		  timerOut : out std_logic);
end TimerN;

architecture Behavioral of TimerN is
signal s_count : integer := 0;
begin
		process(clk)
		begin
		
			if (DecIn = "001") then
				N <= 
				if (rising_edge(clk)) then
						if (s_count = N) then
							if (start = '1') then
								timerOut <= '0';
								s_count <= s_count - 1;
							else
								timerOut <= '0';
							end if;
						else 
							if (s_count = (0)) then
								timerOut <= '1';
								s_count <= N;
							else
								timerOut <= '0';
								s_count <= s_count - 1;
							end if;
						end if;
					end if;
				end if;
				elsif (DecIn = "010") then
				if (rising_edge(clk)) then
						if (s_count = N) then
							if (start = '1') then
								timerOut <= '0';
								s_count <= s_count - 1;
							else
								timerOut <= '0';
							end if;
						else 
							if (s_count = (0)) then
								timerOut <= '1';
								s_count <= N;
							else
								timerOut <= '0';
								s_count <= s_count - 1;
							end if;
						end if;
					end if;
				elsif (DecIn = "100") then
				if (rising_edge(clk)) then
						if (s_count = N) then
							if (start = '1') then
								timerOut <= '0';
								s_count <= s_count - 1;
							else
								timerOut <= '0';
							end if;
						else 
							if (s_count = (0)) then
								timerOut <= '1';
								s_count <= N;
							else
								timerOut <= '0';
								s_count <= s_count - 1;
							end if;
						end if;
					end if;
					elsif (DecIn = "101") then
				if (rising_edge(clk)) then
						if (s_count = N) then
							if (start = '1') then
								timerOut <= '0';
								s_count <= s_count - 1;
							else
								timerOut <= '0';
							end if;
						else 
							if (s_count = (0)) then
								timerOut <= '1';
								s_count <= N;
							else
								timerOut <= '0';
								s_count <= s_count - 1;
							end if;
						end if;
					end if;
		end process;

end architecture;