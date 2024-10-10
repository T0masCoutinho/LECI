library IEEE;
use IEEE.STD_LOGIC_1164.all;

entity AirFryerFSM is
	port(reset	: in  std_logic;
		  clk		: in  std_logic;
		  tIN	   : in  std_logic;
		  pIn	   : in std_logic_vector(3 downto 0);
		  openOven : in std_logic;
		  FoodIn	: out std_logic;
		  pOut	: out std_logic_vector(3 downto 0);
		  state	: out std_logic_vector(2 downto 0);
		  TempOut : out std_logic_vector(3 downto 0);
		  TimeOut : out std_logic_vector(3 downto 0));
end AirFryerFSM;

architecture Behavioral of AirFryerFSM is

	type TState is (Idle, PreHeat, COOK, Finish, Cool, OpenClose);
	signal s_currentState, s_nextState : TState;
	signal s_progTemp  : std_logic_vector(7 downto 0);
	signal s_newTemp : std_logic_vector(3 downto 0);
	signal s_decIn   : std_logic_vector(3 downto 0);
	constant c_timerOut : std_logic;
	
	

begin

	tempCtrl: entity work.TempCtrl(Behavioral) 
				port map(program => s_progTemp,
							temperature => s_newTemp);
							
	timerFixed: entity work.TimerN(Behavioral)
					port map(DecIN => s_decIn,
								timerOut => c_timerOut);
							
	sync_proc : process(clk)
	begin
		if (rising_edge(clk)) then
			if (reset = '0') then
				s_currentState <= Idle;
			else
				s_currentState <= s_nextState;
			end if;
		end if;
	end process;

	comb_proc : process(s_currentState, pIn, pOut)
	begin
		case (s_currentState) is
		when Idle =>
			state <= "000";
			if (pIn = "001") then
				pOut <= pIn;
				s_progTemp <= "00000001";
				s_nextState <= PreHeat;
				
			elsif (pIn = "010") then
				pOut <= pIn;
				s_progTemp <= "00000010";
				s_nextState <= PreHeat;
			elsif (pIn = "100") then
				pOut <= pIn;
				s_progTemp <= "00000011";
				s_nextState <= PreHeat;
			elsif (pIn = "101") then
				pOut <= pIn;
				s_progTemp <= "00000100";
				s_nextState <= PreHeat;
			elsif (pIn = "110") then
				pOut <= pIn;
				s_progTemp <= "00000101";
				s_nextState <= PreHeat;
			else
				s_nextState <= s_currentState;
				s_progTemp <= "00000000";
			end if;

		when PreHeat =>
			state <= "001";
			if (tIn = '1') then
				s_nextState <= OpenClose;
			else
				s_nextState <= s_currentState;
			end if;

		when OpenClose =>
			state <= "010";
			if (openOven = '1') then
				s_nextState <= Cook ;
			else
				s_nextState <= s_currentState;
			end if;

		when Cook =>

			state <= "011";
			if (tIN = '1') then
				if(pIn = "001") then
					
					s_nextState <= Finish;
			else
				s_nextState <= s_currentState;
			end if;
			end if;

		when Finish =>
			state <= "100";
			if (openOven = '1') then
				s_nextState <= Cool;
			else
				s_nextState <= s_currentState;
			end if;

		when Cool =>
			state <= "101";
			s_nextState <= Idle;
			s_progTemp <= "00000000";
		end case;

	end process;

end Behavioral;